package ru.poltorakov.domain.exception.UserException;

import ru.poltorakov.domain.exception.ApiException.ClientException;
import ru.poltorakov.domain.exception.ApiException.UserExceptionType;

/**
 * Exception indicating that a user already exists.
 * <p>
 * This exception is thrown when an attempt is made to create a user that already exists in the system.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public class UserAlreadyExistsException extends ClientException {
    public UserAlreadyExistsException(UserExceptionType type, String message) {
        super(type, message);
    }
}
