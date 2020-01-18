package pl.jkan.pp5.creditcard.model;

import java.math.BigDecimal;

class CreditCard {
    private BigDecimal limit;
    private BigDecimal balance;
    private String number;

    public CreditCard(String number) {
        this.number = number;
    }

    public void assignLimit(BigDecimal initialLimit) {

        if (BigDecimal.valueOf(1000).compareTo(initialLimit) == 1) {
            throw new CreditBelowLimitException();
        }

        limit = initialLimit;
        balance = initialLimit;
    }

    public BigDecimal limit() {
        return limit;
    }

    public void withdraw(BigDecimal amount) {
        this.balance = balance.subtract(amount);
    }

    public BigDecimal currentBalance() {
        return balance;
    }

    public String getNumber() {
        return number;
    }

    private long getBalance() {
        return 0;
    }

    public CardSummary getSummary() {
        return new CardSummary(number, balance);
    }

    public Object assignLimit() {
        return assignLimit();
    }
}
