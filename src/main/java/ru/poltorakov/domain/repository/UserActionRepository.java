package ru.poltorakov.domain.repository;

import org.springframework.stereotype.Component;
import ru.poltorakov.domain.model.useraction.UserAction;
import ru.poltorakov.domain.model.users.User;

import java.sql.SQLException;
import java.util.List;

/**
 * The {@code UserActionRepository} interface represents a repository for user actions in a gaming system.
 * It defines methods to retrieve and save user actions.
 * @see UserAction
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
@Component
public interface UserActionRepository {

    List<UserAction> getAllUserActionsByUser(User user) throws SQLException;

    UserAction saveUserAction(User user, UserAction userAction) throws SQLException;

    List<UserAction> getAllActions() throws SQLException;
}
