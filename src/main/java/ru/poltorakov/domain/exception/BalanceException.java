package ru.poltorakov.domain.exception;

import ru.poltorakov.domain.exception.ApiException.ClientException;
import ru.poltorakov.domain.exception.ApiException.UserExceptionType;

/**
 * The {@code BalanceException} class represents an exception that is thrown when there is an issue related to a user's balance during a transaction.
 * It extends the {@link ClientException} class to handle this specific type of balance-related issue.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public class BalanceException extends ClientException {
    
    public BalanceException(UserExceptionType type, String message) {
        super(type, message);
    }
    
    public BalanceException(UserExceptionType type, Exception exception) {
        super(type, exception);
    }
    
    public BalanceException(UserExceptionType type) {
        super(type);
    }
}