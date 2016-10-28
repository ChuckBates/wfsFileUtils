package psa.Objects.Export;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("packages")
public class ExportPackages {
    @XStreamImplicit(itemFieldName = "package")
    private List<ExportPackage> packages = new ArrayList<>();

    public List<ExportPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<ExportPackage> packages) {
        this.packages = packages;
    }
}
