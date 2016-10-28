package jusuru.Objects;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cbates
 */
public class ImportOrder {
    private List<ImportLine> lineList = new ArrayList<>();

    public List<ImportLine> getLineList() {
        return lineList;
    }

    public void setLineList(List<ImportLine> lineList) {
        this.lineList = lineList;
    }

    public void addLine(ImportLine line) {
        lineList.add(line);
    }
}
