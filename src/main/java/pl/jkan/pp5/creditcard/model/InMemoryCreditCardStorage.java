package pl.jkan.pp5.creditcard.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryCreditCardStorage {
    Map<String, CreditCard> cards = new ConcurrentHashMap<String, CreditCard>();


    public void withdraw(String number) {
    }

    public void add(CreditCard creditCard) {
        cards.put(creditCard.getNumber(), creditCard);
    }

    public CreditCard load(String number) {
        return cards.get(number);
    }
}
