package ru.poltorakov.domain.model.transaction;

import ru.poltorakov.domain.model.users.User;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * The {@code Transaction} class represents a financial transaction in the application.
 * It contains information about the transaction, including the transaction ID, amount,
 * recipient account, transaction time, transaction type, and transaction status.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public class Transaction {

    private String id;
    private BigDecimal amount;
    private User recipientAccount;
    private ZonedDateTime transactionTime;
    private TransactionType transactionType;
    private TransactionStatus transactionStatus;

    public Transaction() {
    }

    /**
     * Constructs a transaction with the specified details.
     * @param id                The transaction ID.
     * @param amount            The transaction amount.
     * @param recipientAccount  The recipient account for the transaction.
     * @param transactionType   The type of the transaction.
     * @param transactionStatus The status of the transaction.
     */
    public Transaction(String id, BigDecimal amount, User recipientAccount, TransactionType transactionType, TransactionStatus transactionStatus) {
        this.id = id;
        this.amount = amount;
        this.recipientAccount = recipientAccount;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
        transactionTime = ZonedDateTime.now();
    }

    public Transaction(String id, BigDecimal amount,
                       User recipientAccount, ZonedDateTime transactionTime,
                       TransactionType transactionType, TransactionStatus transactionStatus) {
        this(id, amount, recipientAccount, transactionType, transactionStatus);
        this.transactionTime = transactionTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public User getRecipientAccount() {
        return recipientAccount;
    }

    public void setRecipientAccount(User recipientAccount) {
        this.recipientAccount = recipientAccount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public ZonedDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    @Override
    public String toString() {

        return "transaction time = " + transactionTime.format(DateTimeFormatter.RFC_1123_DATE_TIME) +
                "; recepient = " + recipientAccount.getLogin() +
                "; amount = " + amount.setScale(2, RoundingMode.HALF_UP) +
                "; status = " + transactionStatus.getText() +
                "; type = " + transactionType.getText() +".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }
}
