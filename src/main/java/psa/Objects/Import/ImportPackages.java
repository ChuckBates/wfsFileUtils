package psa.Objects.Import;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * User: cbates
 */
@XStreamAlias("packages")
public class ImportPackages {
    @XStreamImplicit(itemFieldName = "package")
    private List<ImportPackage> packages = new ArrayList<>();

    public List<ImportPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<ImportPackage> packages) {
        this.packages = packages;
    }
}
