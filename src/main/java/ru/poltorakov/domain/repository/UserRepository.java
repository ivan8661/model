package ru.poltorakov.domain.repository;

import org.springframework.stereotype.Component;
import ru.poltorakov.domain.model.users.User;

import java.sql.SQLException;

/**
 * The {@code UserRepository} interface defines the contract for managing user data in the application.
 * Implementations of this interface provide methods for saving, finding, and updating user information.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
@Component
public interface UserRepository  {

    User saveUser(User user) throws SQLException;

    User findUserByLogin(String login) throws SQLException;

    User updateUser(User user) throws SQLException;
}
