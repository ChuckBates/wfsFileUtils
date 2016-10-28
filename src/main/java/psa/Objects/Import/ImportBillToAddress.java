package psa.Objects.Import;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * User: cbates
 */
@XStreamAlias("billto")
public class ImportBillToAddress {
    @XStreamAlias("tp_accnt")
    private String tp_accnt;
    @XStreamAlias("billAddr1")
    private String billAddr1;
    @XStreamAlias("billAddr2")
    private String billAddr2;
    @XStreamAlias("billAddressee")
    private String billAddressee;
    @XStreamAlias("billAttention")
    private String billAttention;
    @XStreamAlias("billCity")
    private String billCity;
    @XStreamAlias("billState")
    private String billState;
    @XStreamAlias("billZip")
    private String billZip;
    @XStreamAlias("billCountry")
    private String billCountry;
    @XStreamAlias("billPhone")
    private String billPhone;
    @XStreamAlias("billIsResidential")
    private boolean billIsResidential;

    public String getTp_accnt() {
        return tp_accnt;
    }

    public void setTp_accnt(String tp_accnt) {
        this.tp_accnt = tp_accnt;
    }

    public String getBillAddr1() {
        return billAddr1;
    }

    public void setBillAddr1(String billAddr1) {
        this.billAddr1 = billAddr1;
    }

    public String getBillAddr2() {
        return billAddr2;
    }

    public void setBillAddr2(String billAddr2) {
        this.billAddr2 = billAddr2;
    }

    public String getBillAddressee() {
        return billAddressee;
    }

    public void setBillAddressee(String billAddressee) {
        this.billAddressee = billAddressee;
    }

    public String getBillAttention() {
        return billAttention;
    }

    public void setBillAttention(String billAttention) {
        this.billAttention = billAttention;
    }

    public String getBillCity() {
        return billCity;
    }

    public void setBillCity(String billCity) {
        this.billCity = billCity;
    }

    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState;
    }

    public String getBillZip() {
        return billZip;
    }

    public void setBillZip(String billZip) {
        this.billZip = billZip;
    }

    public String getBillPhone() {
        return billPhone;
    }

    public void setBillPhone(String billPhone) {
        this.billPhone = billPhone;
    }

    public String getBillCountry() {
        return billCountry;
    }

    public void setBillCountry(String billCountry) {
        this.billCountry = billCountry;
    }

    public boolean isBillIsResidential() {
        return billIsResidential;
    }

    public void setBillIsResidential(boolean billIsResidential) {
        this.billIsResidential = billIsResidential;
    }
}
