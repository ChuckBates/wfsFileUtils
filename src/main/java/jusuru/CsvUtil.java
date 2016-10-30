package jusuru;

import com.evnt.util.FbiMessage;
import com.evnt.util.Util;
import com.fbi.util.FbiException;
import jusuru.Constants.ImportHeadersConst;
import jusuru.Objects.ExportLine;
import jusuru.Objects.ImportLine;
import jusuru.Objects.ImportOrder;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * User: Chuck
 */
public class CsvUtil {

    public static List<ImportOrder> readCsvFile(File file) throws IOException, ParseException {
        CSVFormat format = CSVFormat.EXCEL.withHeader().withDelimiter(',');
        CSVParser parser = new CSVParser(new FileReader(file), format);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a XXX");

        String previousOrderId = "";

        ImportOrder order = null;
        List<ImportOrder> orderList = new ArrayList<>();
        List<ImportLine> lineList = new ArrayList<>();

        for (CSVRecord record : parser) {
            ImportLine line = new ImportLine();
            String orderId = record.get(ImportHeadersConst.ORDER_ID.getHeader());
            boolean sameOrder = previousOrderId.equalsIgnoreCase(orderId);

            if (sameOrder) {
                order = orderList.get(orderList.size() - 1);
                lineList = order.getLineList();
            }

            line.setOrderId(orderId);
            line.setShipName1(record.get(ImportHeadersConst.SHIP_NAME_1.getHeader()));
            line.setShipName2(record.get(ImportHeadersConst.SHIP_NAME_2.getHeader()));
            line.setShipStreet1(record.get(ImportHeadersConst.SHIP_STREET_1.getHeader()));
            line.setShipStreet2(record.get(ImportHeadersConst.SHIP_STREET_2.getHeader()));
            line.setShipCity(record.get(ImportHeadersConst.SHIP_CITY.getHeader()));
            line.setShipState(record.get(ImportHeadersConst.SHIP_STATE.getHeader()));
            line.setShipZip(record.get(ImportHeadersConst.SHIP_ZIP.getHeader()));
            line.setShipCountry(record.get(ImportHeadersConst.SHIP_COUNTRY.getHeader()));

            String date = record.get(ImportHeadersConst.ORDER_DATE.getHeader());
            Date orderDate;
            if (!Util.isEmpty(date)) {
                orderDate = formatter.parse(date);
            } else {
                orderDate = new Date();
            }
            line.setOrderDate(orderDate);

            line.setShipPhone(record.get(ImportHeadersConst.SHIP_PHONE.getHeader()));
            line.setEmailPresent(record.get(ImportHeadersConst.EMAIL_PRESENT.getHeader()));
            line.setShipEmail(record.get(ImportHeadersConst.SHIP_EMAIL.getHeader()));
            line.setShipMethod(record.get(ImportHeadersConst.SHIP_METHOD.getHeader()));
            line.setProductNumber(record.get(ImportHeadersConst.PRODUCT_NUMBER.getHeader()));
            line.setDescription(record.get(ImportHeadersConst.DESCRIPTION.getHeader()));
            line.setQuantity(Double.parseDouble(record.get(ImportHeadersConst.QUANTITY.getHeader())));
            line.setPackageWeight(Double.parseDouble(record.get(ImportHeadersConst.PACKAGE_WEIGHT.getHeader())));
            line.setRepNumber(record.get(ImportHeadersConst.REP_NUMBER.getHeader()));

            lineList.add(line);

            if (parser.getCurrentLineNumber() <= 2) {
                order = new ImportOrder();
                order.setLineList(lineList);
            }

            if (order != null && !sameOrder) {
                orderList.add(order);
            }

            lineList = new ArrayList<>();
            order = new ImportOrder();
            order.setLineList(lineList);

            previousOrderId = orderId;
        }

        parser.close();

        return orderList;
    }

    public static void writeShippedOrders(List<ExportLine> exportLines, File outputFile) throws FbiException {
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator("\n");

        String[] headers = {"orderNumber", "trackingNumber", "lotNumber"};
        writeLines(exportLines, outputFile, csvFileFormat, headers);
    }

    public static void writeUnShippedOrders(List<ExportLine> exportLines, File outputFile) throws FbiException {
        CSVFormat csvFileFormat = CSVFormat.DEFAULT.withRecordSeparator("\n");

        String[] headers = {"orderNumber"};
        writeLines(exportLines, outputFile, csvFileFormat, headers);
    }

    public static File createCsvFile(String filePath) {
        Calendar now = Calendar.getInstance();
        return new File(filePath +
                now.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault()) + " " +
                now.get(Calendar.DATE) + ", " +
                now.get(Calendar.HOUR) + "_" +
                now.get(Calendar.MINUTE) + " " +
                now.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()) + ".csv");
    }

    private static void writeLines(List<ExportLine> exportLines, File outputFile, CSVFormat csvFileFormat, String[] headers) throws FbiException {
        try (FileWriter writer = new FileWriter(outputFile.getAbsoluteFile()); CSVPrinter printer = new CSVPrinter(writer, csvFileFormat)){
            printer.printRecord(headers);

            for (ExportLine line : exportLines) {
                List<String> record = new ArrayList<>();
                if (Util.isEmpty(line.getOrderNum())) {
                    throw new FbiException(FbiMessage.FILE_WRITE_ERROR, "Order number required for export");
                }
                record.add(line.getOrderNum());

                if (!Util.isEmpty(line.getTrackingNum())) {
                    record.add(line.getTrackingNum());
                }

                if (!Util.isEmpty(line.getLotNum())) {
                    record.add(line.getLotNum());
                }

                printer.printRecord(record);
            }
        } catch (IOException e) {
            // Log something
        }
    }
}
