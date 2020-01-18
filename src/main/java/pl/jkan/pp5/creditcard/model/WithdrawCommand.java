package pl.jkan.pp5.creditcard.model;

import java.math.BigDecimal;

public class WithdrawCommand {
    private final String number;
    private final BigDecimal amount;

    public WithdrawCommand(String number, BigDecimal amount) {
        this.number = number;
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
