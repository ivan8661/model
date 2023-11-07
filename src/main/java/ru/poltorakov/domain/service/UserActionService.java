package ru.poltorakov.domain.service;

import org.springframework.stereotype.Component;
import ru.poltorakov.domain.model.useraction.UserAction;
import ru.poltorakov.domain.model.users.User;

import java.sql.SQLException;
import java.util.List;

/**
 * The {@code UserActionService} interface defines the contract for managing user actions in the application.
 * Implementations of this interface provide methods for saving user actions and retrieving user actions.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
@Component
public interface UserActionService {
    
    /**
     * Saves a user action associated with a specific user.
     * @param user       The user associated with the action.
     * @param userAction The user action to be saved.
     * @return The saved user action.
     */
    UserAction saveUserAction(User user, UserAction userAction) throws SQLException;

    /**
     * Retrieves a list of user actions associated with a specific user.
     * @param user The user for whom actions are retrieved.
     * @return A list of user actions associated with the user.
     */
    List<UserAction> getUserActions(User user) throws SQLException;

    /**
     * Retrieves a list of all user actions recorded in the system.
     * @return A list of all user actions in the system.
     * @throws SQLException If an error occurs while accessing the database.
     */
    List<UserAction> getAllUsersActions() throws SQLException;
}
