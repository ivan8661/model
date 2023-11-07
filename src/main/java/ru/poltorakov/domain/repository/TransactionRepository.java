package ru.poltorakov.domain.repository;

import org.springframework.stereotype.Component;
import ru.poltorakov.domain.model.transaction.Transaction;

import java.sql.SQLException;
import java.util.List;

/**
 * The {@code PlayerActionRepository} interface defines the contract for managing player actions in the application.
 * Implementations of this interface provide methods for retrieving, saving, and managing player actions.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
@Component
public interface TransactionRepository {

    Transaction findTransactionById(String id) throws SQLException;

    Transaction saveTransaction(Transaction transaction) throws SQLException;

    List<Transaction> getAllTransactionByLogin(String login) throws SQLException;

    List<Transaction> getAllTransactions() throws SQLException;
}
