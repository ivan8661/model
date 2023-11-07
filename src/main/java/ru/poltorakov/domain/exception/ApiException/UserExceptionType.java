package ru.poltorakov.domain.exception.ApiException;

import org.springframework.http.HttpStatus;

/**
 * Enumeration representing different types of user-related exceptions.
 * Each enum member corresponds to a specific type of exception and provides
 * information such as the HTTP status code, error code, and default error message.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public enum UserExceptionType {

    OBJECT_NOT_FOUND, ENDPOINT_NOT_FOUND, WRONG_SESSION, EMPTY_SESSION, VALIDATION_ERROR, SYNTAX_ERROR, TOO_OFTEN, SERVER_ERROR, TIMEOUT;

    Integer getHTTPCode() {
        return getHttpStatus().value();
    }

    String getCode() {
        return switch (this) {
            case OBJECT_NOT_FOUND -> "not_found";
            case ENDPOINT_NOT_FOUND -> "not_found";
            case WRONG_SESSION -> "forbidden";
            case EMPTY_SESSION -> "forbidden";
            case VALIDATION_ERROR -> "validation_error";
            case SYNTAX_ERROR -> "syntax_error";
            case TOO_OFTEN -> "too_often";
            case TIMEOUT -> "timeout";
            default -> "internal_server_error";
        };
    }

    String getDefaultMessage() {
        return switch (this) {
            case OBJECT_NOT_FOUND -> "Object doesn't exist";
            case ENDPOINT_NOT_FOUND -> "Wrong URL";
            case WRONG_SESSION -> "Access is not permitted";
            case EMPTY_SESSION -> "You are not logged in";
            case VALIDATION_ERROR -> "Wrong data passed";
            case SYNTAX_ERROR -> "Request syntax error";
            case TOO_OFTEN -> "Too many requests, cool down";
            case TIMEOUT -> "Request timeouted";
            default -> "Unknown error occurred";
        };
    }

    HttpStatus getHttpStatus() {
        return switch (this) {
            case OBJECT_NOT_FOUND -> HttpStatus.NOT_FOUND;
            case ENDPOINT_NOT_FOUND -> HttpStatus.NOT_IMPLEMENTED;
            case WRONG_SESSION -> HttpStatus.FORBIDDEN;
            case EMPTY_SESSION -> HttpStatus.UNAUTHORIZED;
            case VALIDATION_ERROR, SYNTAX_ERROR -> HttpStatus.BAD_REQUEST;
            case TOO_OFTEN, TIMEOUT -> HttpStatus.REQUEST_TIMEOUT;
            default -> HttpStatus.INTERNAL_SERVER_ERROR;
        };
    }
}