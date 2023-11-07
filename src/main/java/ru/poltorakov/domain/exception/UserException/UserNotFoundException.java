package ru.poltorakov.domain.exception.UserException;

import ru.poltorakov.domain.exception.ApiException.ClientException;
import ru.poltorakov.domain.exception.ApiException.UserExceptionType;

/**
 * Exception indicating that a user was not found.
 * <p>
 * This exception is thrown when an attempt is made to find a user that does not exist in the system.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public class UserNotFoundException extends ClientException {
    public UserNotFoundException(UserExceptionType type, String message) {
        super(type, message);
    }
}
