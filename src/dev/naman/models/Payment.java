package dev.naman.models;

import dev.naman.service.payment.PaymentStrategy;

public class Payment extends BaseModel {
    private Transaction transaction;
    private PaymentStatus status;
    private PaymentStrategyType strategy;
    // private PaymentStrategy method;

}

// waiter -> chef -> ingredients -> fridge
// controller -> service -> models -> repository


// PaymentService {

//     pay() {
//         paymentStrategyFactory.getSTtrategyForType(payment.getStrategy()).pay();

//     }
// }

// Model -> Payments -> payments
// Transaction -> transactions
// Abstract methods -> Abstract CLass