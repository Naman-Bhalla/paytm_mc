package dev.naman.service.payment;

import dev.naman.models.CardType;

public class CardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private CardType type;
    private String validity;

    @Override
    public void pay() {

    }
}

// strategy
