package cj.netos.rc.wybank.model;

/**
 * Table: shuntin_index
 */
public class ShuntinIndex {
    /**
     * Column: id
     */
    private String id;

    /**
     * Column: amount
     * Remark: 分账总金额
     */
    private Long amount;

    /**
     * Column: bankid
     */
    private String bankid;

    /**
     * Column: shunter
     * Remark: 分账器
     */
    private String shunter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getShunter() {
        return shunter;
    }

    public void setShunter(String shunter) {
        this.shunter = shunter == null ? null : shunter.trim();
    }
}