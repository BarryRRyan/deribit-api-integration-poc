package techtest.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deposit {
    private long updated_timestamp;
    private String transaction_id;
    private String state;
    private long received_timestamp;
    private String note;
    private String currency;
    private BigDecimal amount;
    private String address;

    public long getUpdated_timestamp() {
        return updated_timestamp;
    }

    public void setUpdated_timestamp(long updated_timestamp) {
        this.updated_timestamp = updated_timestamp;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getReceived_timestamp() {
        return received_timestamp;
    }

    public void setReceived_timestamp(long received_timestamp) {
        this.received_timestamp = received_timestamp;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "updated_timestamp=" + updated_timestamp +
                ", transaction_id='" + transaction_id + '\'' +
                ", state='" + state + '\'' +
                ", received_timestamp=" + received_timestamp +
                ", note='" + note + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", address='" + address + '\'' +
                '}';
    }
}
