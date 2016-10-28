package psa.Objects.Export;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("orders")
public class ExportOrders {
    @XStreamImplicit(itemFieldName = "order")
    private List<ExportOrder> orders = new ArrayList<>();

    public List<ExportOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ExportOrder> orders) {
        this.orders = orders;
    }
}
