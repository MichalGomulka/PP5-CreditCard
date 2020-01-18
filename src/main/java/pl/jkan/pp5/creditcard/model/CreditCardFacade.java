package pl.jkan.pp5.creditcard.model;


public class CreditCardFacade {

    private InMemoryCreditCardStorage creditCardStorage;

    public CreditCardFacade(InMemoryCreditCardStorage creditCardStorage) {
        this.creditCardStorage = creditCardStorage;
    }

    public CreditCardFacade() {

    }

    public void withdraw(WithdrawCommand withdrawCommand) {
        CreditCard creditCard = creditCardStorage.load(withdrawCommand.getNumber());
        creditCard.withdraw(withdrawCommand.getAmount());
        creditCardStorage.add(creditCard);
    }

    public CardSummary getSummary(String number) {
        CreditCard creditCard = creditCardStorage.load(number);
        return creditCard.getsummary();
    }
}
