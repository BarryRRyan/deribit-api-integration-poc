package techtest.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private BigDecimal balance;
    private String deposit_address;
    private String username;
    private String type;
    private String currency;
    private BigDecimal available_withdrawal_funds;
    private BigDecimal available_funds;
    private BigDecimal reserved; // Assuming this is derived; balance - available = reserved.

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getDeposit_address() {
        return deposit_address;
    }

    public void setDeposit_address(String deposit_address) {
        this.deposit_address = deposit_address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAvailable_withdrawal_funds() {
        return available_withdrawal_funds;
    }

    public void setAvailable_withdrawal_funds(BigDecimal available_withdrawal_funds) {
        this.available_withdrawal_funds = available_withdrawal_funds;
    }

    public BigDecimal getAvailable_funds() {
        return available_funds;
    }

    public void setAvailable_funds(BigDecimal available_funds) {
        this.available_funds = available_funds;
    }

    public BigDecimal getReserved() {
        return reserved;
    }

    public void updateReserved() {
        if (Objects.isNull(balance) || Objects.isNull(available_funds)) {
            this.reserved = null;
        } else {
            this.reserved = balance.subtract(available_funds);
        }
    }
}
