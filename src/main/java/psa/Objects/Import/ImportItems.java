package psa.Objects.Import;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("items")
public class ImportItems {
    @XStreamImplicit(itemFieldName = "item")
    private List<ImportItem> items = new ArrayList<>();

    public List<ImportItem> getItems() {
        return items;
    }

    public void setItems(List<ImportItem> items) {
        this.items = items;
    }
}
