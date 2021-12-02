package dev.naman.models;

import dev.naman.service.payment.PaymentStrategy;

public class Payment extends BaseModel {
    private Transaction transaction;
    private PaymentStatus status;
    private PaymentStrategy method;

}

// waiter -> chef -> ingredients -> fridge
// controller -> service -> models -> repository