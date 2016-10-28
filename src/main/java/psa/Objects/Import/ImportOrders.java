package psa.Objects.Import;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("orders")
public class ImportOrders {
    @XStreamImplicit(itemFieldName = "order")
    private List<ImportOrder> orders = new ArrayList<>();

    public List<ImportOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ImportOrder> orders) {
        this.orders = orders;
    }
}
