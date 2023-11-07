package ru.poltorakov.domain.model.transaction;

/**
 * The {@code TransactionStatus} enum represents the status of a financial transaction.
 * It can have two values: "APPROVED" or "DECLINED."
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public enum TransactionStatus {
    APPROVED ("approved"),
    DECLINED ("declined");

    private String text;

    TransactionStatus() {
    }

    TransactionStatus(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
