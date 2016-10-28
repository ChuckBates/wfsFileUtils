package psa.Objects.Export;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("order")
public class ExportOrder {
    @XStreamAlias("orderId")
    private String orderId;

    @XStreamAlias("packages")
    @XStreamImplicit(itemFieldName = "packages")
    private List<ExportPackage> packages;

    @XStreamAlias("items")
    @XStreamImplicit(itemFieldName = "items")
    private List<ExportItem> items;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<ExportItem> getItems() {
        return items;
    }

    public void setItems(List<ExportItem> items) {
        this.items = items;
    }

    public List<ExportPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<ExportPackage> packages) {
        this.packages = packages;
    }
}
