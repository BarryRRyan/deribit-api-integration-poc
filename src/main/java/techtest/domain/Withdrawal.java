package techtest.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Withdrawal {
    private String address;
    private BigDecimal amount;
    private Long confirmed_timestamp;
    private Long created_timestamp;
    private String currency;
    private BigDecimal fee;
    private Long id;
    private Double priority;
    private String state;
    private String transaction_id;
    private Long updated_timestamp;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getConfirmed_timestamp() {
        return confirmed_timestamp;
    }

    public void setConfirmed_timestamp(Long confirmed_timestamp) {
        this.confirmed_timestamp = confirmed_timestamp;
    }

    public Long getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(Long created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPriority() {
        return priority;
    }

    public void setPriority(Double priority) {
        this.priority = priority;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Withdrawal{" +
                "address='" + address + '\'' +
                ", amount=" + amount +
                ", confirmed_timestamp=" + confirmed_timestamp +
                ", created_timestamp=" + created_timestamp +
                ", currency='" + currency + '\'' +
                ", fee=" + fee +
                ", id=" + id +
                ", priority=" + priority +
                ", state='" + state + '\'' +
                ", transaction_id='" + transaction_id + '\'' +
                ", updated_timestamp=" + updated_timestamp +
                '}';
    }
}
