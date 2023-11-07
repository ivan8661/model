package ru.poltorakov.domain.service;

import org.springframework.stereotype.Component;
import ru.poltorakov.domain.exception.TransactionAlreadyExistsException;
import ru.poltorakov.domain.model.transaction.Transaction;

import java.sql.SQLException;
import java.util.List;

/**
 * The {@code TransactionService} interface defines the contract for managing transactions in the application.
 * Implementations of this interface provide methods for recording transactions and retrieving transaction history.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
@Component
public interface TransactionService {

    Transaction recordTransaction(Transaction transaction) throws SQLException, TransactionAlreadyExistsException;

    /**
     * Retrieves the transaction history for a user based on their login.
     * @param login The login of the user for whom the transaction history is retrieved.
     * @return A list of transactions representing the user's transaction history.
     */
    List<Transaction> getUserHistoryTransaction(String login) throws SQLException;

    /**
     * Retrieves a transaction by its unique identifier (ID).
     * @param id The unique identifier (ID) of the transaction to retrieve.
     * @return The transaction associated with the provided ID, or {@code null} if not found.
     * @throws SQLException If an error occurs while accessing the database.
     */
    Transaction getTransactionById(String id) throws SQLException;

    /**
     * Retrieves a list of all transactions stored in the system.
     * @return A list of all transactions.
     * @throws SQLException If an error occurs while accessing the database.
     */
    List<Transaction> getAllTransactions() throws SQLException;
}
