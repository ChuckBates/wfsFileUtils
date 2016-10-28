package psa.Objects.Export;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("items")
public class ExportItems {
    @XStreamImplicit(itemFieldName = "item")
    private List<ExportItem> items = new ArrayList<>();

    public List<ExportItem> getItems() {
        return items;
    }

    public void setItems(List<ExportItem> items) {
        this.items = items;
    }
}
