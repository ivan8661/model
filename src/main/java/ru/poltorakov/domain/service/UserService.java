package ru.poltorakov.domain.service;

import org.springframework.stereotype.Component;
import ru.poltorakov.domain.dto.TransactionDTO;
import ru.poltorakov.domain.dto.UserDTO;
import ru.poltorakov.domain.exception.BalanceException;
import ru.poltorakov.domain.exception.TransactionAlreadyExistsException;
import ru.poltorakov.domain.exception.UserException.UserAlreadyExistsException;
import ru.poltorakov.domain.exception.UserException.UserNotFoundException;
import ru.poltorakov.domain.model.transaction.Transaction;
import ru.poltorakov.domain.model.users.User;

import java.io.IOException;
import java.sql.SQLException;

/**
 * The {@code UserService} interface defines the contract for managing user-related operations in the application.
 * Implementations of this interface provide methods for user registration, authentication, balance retrieval,
 * fund withdrawal, fund deposit, and user information retrieval.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
@Component
public interface UserService {

        /**
         * Registers a new user in the system.
         * @param userDTO The user to be registered.
         * @return The registered user.
         */
        UserDTO registerUser(UserDTO userDTO) throws SQLException, UserAlreadyExistsException, IOException, UserNotFoundException;

        /**
         * Authenticates a user based on the provided user credentials.
         * This method attempts to authenticate the user using the provided user object, which contains user credentials.
         * If the authentication is successful, it returns the authenticated user. If the authentication fails, it may throw
         * a {@link UserNotFoundException} or a {@link SQLException} if there are database-related issues.
         * @param userDTO The user object containing credentials for authentication.
         * @return The authenticated user if the authentication is successful.
         * @throws UserNotFoundException If the user is not found or authentication fails.
         * @throws SQLException If there are database-related issues during authentication.
         */
        UserDTO authenticate(UserDTO userDTO) throws UserNotFoundException, SQLException, IOException;

        UserDTO withdraw(UserDTO userDTO, TransactionDTO transactionDTO) throws UserNotFoundException, SQLException,
                IOException, TransactionAlreadyExistsException, BalanceException;

        UserDTO fund(UserDTO userDTO, TransactionDTO transactionDTO) throws UserNotFoundException, SQLException,
                IOException, TransactionAlreadyExistsException;

        /**
         * Checks if a user with the given login exists in the system.
         * @param login The login to check.
         * @return {@code true} if a user with the login exists; otherwise, {@code false}.
         */
        Boolean userExist(String login) throws SQLException;

        /**
         * Retrieves a user by their login.
         * @param login The login of the user to retrieve.
         * @return The found user or null if not found.
         */
        UserDTO getUserByLogin(String login) throws SQLException;

        /**
         * Retrieves the balance of a user's account.
         * @param userDTO The user for whom the balance is to be retrieved.
         * @return The balance of the user's account.
         * @throws SQLException If an error occurs while accessing the database.
         */
        UserDTO getBalance(UserDTO userDTO) throws SQLException, IOException;
}
