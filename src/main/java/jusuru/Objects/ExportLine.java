package jusuru.Objects;

/**
 * User: cbates
 */
public class ExportLine {

    private String orderNum;
    private String trackingNum;
    private String lotNum;

    public ExportLine(String orderNum, String trackingNum, String lotNum) {
        this.orderNum = orderNum;
        this.trackingNum = trackingNum;
        this.lotNum = lotNum;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getTrackingNum() {
        return trackingNum;
    }

    public void setTrackingNum(String trackingNum) {
        this.trackingNum = trackingNum;
    }

    public String getLotNum() {
        return lotNum;
    }

    public void setLotNum(String lotNum) {
        this.lotNum = lotNum;
    }
}
