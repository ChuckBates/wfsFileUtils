package psa;

import com.evnt.util.FbiMessage;
import com.fbi.util.FbiException;
import com.thoughtworks.xstream.XStream;
import psa.Objects.Export.*;
import psa.Objects.Import.ImportItem;
import psa.Objects.Import.ImportItems;
import psa.Objects.Import.ImportOrder;
import psa.Objects.Import.ImportOrders;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * User: cbates
 */
public class XmlUtil {
    private static FileReader fileReader;

    public static void closeFile() throws IOException {
        if (fileReader != null) {
            fileReader.close();
        }
    }

    public static List<ImportOrder> readXmlFile(File file) throws IOException {
        List<ImportOrder> orderList;

        fileReader = new FileReader(file.getAbsoluteFile());
        XStream xStream = new XStream();

        xStream.alias("orders", ImportOrders.class);
        xStream.addImplicitCollection(ImportOrders.class, "orders");
        xStream.alias("order", ImportOrder.class);

        xStream.alias("items", ImportItems.class);
        xStream.addImplicitCollection(ImportItems.class, "items");
        xStream.alias("item", ImportItem.class);

        orderList = ((ImportOrders) xStream.fromXML(fileReader)).getOrders();

        fileReader.close();
        return orderList;
    }

    public static void writeXmlFile(ExportOrders exportOrders, File xmlFile) throws FbiException {
        XStream xStream = new XStream();

        xStream.alias("orders", ExportOrders.class);
        xStream.addImplicitCollection(ExportOrders.class, "orders");
        xStream.alias("order", ExportOrder.class);

        xStream.alias("items", ExportItems.class);
        xStream.addImplicitCollection(ExportItems.class, "items");
        xStream.alias("item", ExportItem.class);

        xStream.alias("packages", ExportPackages.class);
        xStream.addImplicitCollection(ExportPackages.class, "packages");
        xStream.alias("package", ExportPackage.class);

        OutputStream out = null;
        Writer writer = null;
        try {
            out = new FileOutputStream(xmlFile);
            writer = new OutputStreamWriter(out, Charset.forName("UTF-8"));
            xStream.toXML(exportOrders, writer);
        } catch (FileNotFoundException e) {
            throw new FbiException(FbiMessage.FILE_WRITE_ERROR, e.getMessage(), e);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }

                if (writer != null) {
                    writer.close();
                }
            } catch (IOException ignore) {
                // do nothing
            }
        }
    }

    public static File createXmlFile(String filePath) {
        Calendar now = Calendar.getInstance();
        return new File(filePath +
                now.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault()) + " " +
                now.get(Calendar.DATE) + ", " +
                now.get(Calendar.HOUR) + "_" +
                now.get(Calendar.MINUTE) + " " +
                now.getDisplayName(Calendar.AM_PM, Calendar.SHORT, Locale.getDefault()) + ".xml");
    }
}
