package psa.Objects.Import;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("order")
public class ImportOrder {
    @XStreamAlias("orderId")
    private String orderId;

    @XStreamImplicit(itemFieldName = "packages")
    private List<ImportPackage> packages;

    @XStreamAlias("customer_type")
    private int customer_type;
    @XStreamAlias("po")
    private String po;
    @XStreamAlias("shipping_instr")
    private String shipping_instr;
    @XStreamAlias("shipMethod")
    private String shipMethod;
    @XStreamAlias("billConvReq")
    private boolean billConvReq;
    @XStreamAlias("show_price")
    private boolean show_price;
    @XStreamAlias("shipto")
    private ImportShipToAddress shipto;
    @XStreamAlias("billto")
    private ImportBillToAddress billto;
    @XStreamAlias("payment_method")
    private String payment_method;

    @XStreamImplicit(itemFieldName = "items")
    private List<ImportItem> items;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<ImportPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<ImportPackage> packages) {
        this.packages = packages;
    }

    public int getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(int customer_type) {
        this.customer_type = customer_type;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public String getShipMethod() {
        return shipMethod;
    }

    public void setShipMethod(String shipMethod) {
        this.shipMethod = shipMethod;
    }

    public String getShipping_instr() {
        return shipping_instr;
    }

    public void setShipping_instr(String shipping_instr) {
        this.shipping_instr = shipping_instr;
    }

    public boolean isBillConvReq() {
        return billConvReq;
    }

    public void setBillConvReq(boolean billConvReq) {
        this.billConvReq = billConvReq;
    }

    public boolean isShow_price() {
        return show_price;
    }

    public void setShow_price(boolean show_price) {
        this.show_price = show_price;
    }

    public ImportShipToAddress getShipto() {
        return shipto;
    }

    public void setShipto(ImportShipToAddress shipto) {
        this.shipto = shipto;
    }

    public ImportBillToAddress getBillto() {
        return billto;
    }

    public void setBillto(ImportBillToAddress billto) {
        this.billto = billto;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public List<ImportItem> getItems() {
        return items;
    }

    public void setItems(List<ImportItem> items) {
        this.items = items;
    }
}
