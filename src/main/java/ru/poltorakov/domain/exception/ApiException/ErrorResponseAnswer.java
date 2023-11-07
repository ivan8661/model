package ru.poltorakov.domain.exception.ApiException;

import org.springframework.http.HttpStatus;

/**
 * Interface for handling error responses in the application.
 * <p>
 * This interface defines methods to retrieve information about an error response, including an identifier, error code, associated data, error message, and HTTP status code.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public interface ErrorResponseAnswer {
    int getId();
    String getCode();
    Object getData();
    String getMessage();
    HttpStatus getHttpStatus();
}
