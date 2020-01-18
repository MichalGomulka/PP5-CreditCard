package pl.jkan.pp5.creditcard.ui;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jkan.pp5.creditcard.model.CardSummary;
import pl.jkan.pp5.creditcard.model.CreditCardFacade;


import java.util.Arrays;
import java.util.List;

@RestController
public class CardsController {

    @Autowired
    CreditCardFacade creditCardFacade;

    @GetMapping("/api/test-it")
    public List<String> httpHelloWorld() {
        return Arrays.asList("Hello", "World", "it", "works");
    }
    @GetMapping("/api/cards/balances")
    public List<CardSummary> listSummary() {
        return creditCardFacade.getCardsReport();
    }
}
