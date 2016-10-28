package jusuru.Objects;

import java.util.Date;

/**
 * User: cbates
 */
public class ImportLine {
    private String orderId;
    private String shipName1;
    private String shipName2;
    private String shipStreet1;
    private String shipStreet2;
    private String shipCity;
    private String shipState;
    private String shipZip;
    private String shipCountry;
    private Date orderDate;
    private String shipPhone;
    private String emailPresent;
    private String shipEmail;
    private String shipMethod;
    private String productNumber;
    private String description;
    private double quantity;
    private double packageWeight;
    private String repNumber;

    private double price;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShipName1() {
        return shipName1;
    }

    public void setShipName1(String shipName1) {
        this.shipName1 = shipName1;
    }

    public String getShipName2() {
        return shipName2;
    }

    public void setShipName2(String shipName2) {
        this.shipName2 = shipName2;
    }

    public String getShipStreet1() {
        return shipStreet1;
    }

    public void setShipStreet1(String shipStreet1) {
        this.shipStreet1 = shipStreet1;
    }

    public String getShipStreet2() {
        return shipStreet2;
    }

    public void setShipStreet2(String shipStreet2) {
        this.shipStreet2 = shipStreet2;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipState() {
        return shipState;
    }

    public void setShipState(String shipState) {
        this.shipState = shipState;
    }

    public String getShipZip() {
        return shipZip;
    }

    public void setShipZip(String shipZip) {
        this.shipZip = shipZip;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getShipPhone() {
        return shipPhone;
    }

    public void setShipPhone(String shipPhone) {
        this.shipPhone = shipPhone;
    }

    public String getEmailPresent() {
        return emailPresent;
    }

    public void setEmailPresent(String emailPresent) {
        this.emailPresent = emailPresent;
    }

    public String getShipEmail() {
        return shipEmail;
    }

    public void setShipEmail(String shipEmail) {
        this.shipEmail = shipEmail;
    }

    public String getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(String shipMethod) {
        this.shipMethod = shipMethod;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public String getRepNumber() {
        return repNumber;
    }

    public void setRepNumber(String repNumber) {
        this.repNumber = repNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
