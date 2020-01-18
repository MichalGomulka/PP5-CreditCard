package pl.jkan.pp5.creditcard.model;

public interface CreditCardStorage {
    void add(CreditCard creditCard);

    CreditCard load(String number);
}

