package ru.poltorakov.domain.exception;

import ru.poltorakov.domain.exception.ApiException.ClientException;
import ru.poltorakov.domain.exception.ApiException.UserExceptionType;

public class TransactionAlreadyExistsException extends ClientException {
    public TransactionAlreadyExistsException(UserExceptionType type, String message) {
        super(type, message);
    }
}
