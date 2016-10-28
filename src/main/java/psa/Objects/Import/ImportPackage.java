package psa.Objects.Import;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * User: cbates
 */
@XStreamAlias("Package")
public class ImportPackage {
    @XStreamAlias("ref3")
    private String ref3;
    @XStreamAlias("ref4")
    private String ref4;
    @XStreamAlias("ref5")
    private String ref5;
    @XStreamAlias("tracking")
    private String tracking;
    @XStreamAlias("cost")
    private double cost;
    @XStreamAlias("weight")
    private double weight;

    public ImportPackage(String ref3, String ref4, String ref5, String tracking, double cost, double weight) {
        this.ref3 = ref3;
        this.ref4 = ref4;
        this.ref5 = ref5;
        this.tracking = tracking;
        this.cost = cost;
        this.weight = weight;
    }

    public String getRef3() {
        return ref3;
    }

    public void setRef3(String ref3) {
        this.ref3 = ref3;
    }

    public String getRef4() {
        return ref4;
    }

    public void setRef4(String ref4) {
        this.ref4 = ref4;
    }

    public String getRef5() {
        return ref5;
    }

    public void setRef5(String ref5) {
        this.ref5 = ref5;
    }

    public String getTracking() {
        return tracking;
    }

    public void setTracking(String tracking) {
        this.tracking = tracking;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
