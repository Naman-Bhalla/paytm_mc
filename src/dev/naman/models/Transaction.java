package dev.naman.models;

import java.util.List;

public abstract class Transaction extends BaseModel {
    private User from;
    private int amount;
    private List<Payment> payments;
    private TransactionStatus status;
}

// Spring Boot -> automatically convert into id
