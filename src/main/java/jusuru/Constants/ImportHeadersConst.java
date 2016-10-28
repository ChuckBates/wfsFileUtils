package jusuru.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Chuck
 */
public enum ImportHeadersConst {

    ORDER_ID("Order_ID"),
    SHIP_NAME_1("ShipName1"),
    SHIP_NAME_2("ShipName2"),
    SHIP_STREET_1("ShipStreet1"),
    SHIP_STREET_2("ShipStreet2"),
    SHIP_CITY("ShipCity"),
    SHIP_STATE("ShipState"),
    SHIP_ZIP("ShipPostalCode"),
    SHIP_COUNTRY("ShipCountry"),
    ORDER_DATE("Orderdate"),
    SHIP_PHONE("ShipPhone"),
    EMAIL_PRESENT("EmailPresent"),
    SHIP_EMAIL("ShipEmail"),
    SHIP_METHOD("ShipMethod"),
    PRODUCT_NUMBER("Product"),
    DESCRIPTION("Description"),
    QUANTITY("Qty"),
    PACKAGE_WEIGHT("PackageWeight"),
    REP_NUMBER("Rep#"),
    ;

    private String header;

    ImportHeadersConst(String header) {
        this.header = header;
    }

    public static ImportHeadersConst getConst(String type) {
        for (ImportHeadersConst value : values()) {
            if (value.toString().equals(type)) {
                return value;
            }
        }
        return ORDER_ID;
    }

    public static List<String> getHeaders() {
        List<String> headers = new ArrayList<>();
        for (ImportHeadersConst header : ImportHeadersConst.values()) {
            headers.add(header.getHeader());
        }
        return headers;
    }

    public String getHeader() {
        return header;
    }
}
