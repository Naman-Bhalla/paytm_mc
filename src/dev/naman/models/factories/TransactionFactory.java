package dev.naman.models.factories;

import dev.naman.models.BankAccountTransaction;
import dev.naman.models.Transaction;
import dev.naman.models.TransactionType;
import dev.naman.models.WalletTransaction;
import dev.naman.models.factories.exceptions.InvalidTransactionTypeException;

public class TransactionFactory {

    public static Transaction getTransactionForType(TransactionType type) {
        switch (type) {
            case BANK:
                return new BankAccountTransaction();
            case WALLET:
                return new WalletTransaction();
            default:
                throw new InvalidTransactionTypeException();
        }
    }
}
