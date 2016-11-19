package jusuru.Objects;

/**
 * User: Chuck
 */
public class ClearedItemInfo {

    private String orderNumber;
    private String clientName;
    private String shipToName;
    private String poNumber;
    private String itemNumber;
    private Double qty;

    public ClearedItemInfo(String orderNumber, String clientName, String shipToName, String poNumber, String itemNumber, Double qty) {
        this.orderNumber = orderNumber;
        this.clientName = clientName;
        this.shipToName = shipToName;
        this.poNumber = poNumber;
        this.itemNumber = itemNumber;
        this.qty = qty;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getShipToName() {
        return shipToName;
    }

    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }
}
