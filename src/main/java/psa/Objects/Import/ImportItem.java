package psa.Objects.Import;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * User: cbates
 */
@XStreamAlias("item")
public class ImportItem {
    @XStreamAlias("item_name")
    private String item_name;
    @XStreamAlias("description")
    private String description;
    @XStreamAlias("qty")
    private double qty;
    @XStreamAlias("unit_price")
    private double unit_price;

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }
}
