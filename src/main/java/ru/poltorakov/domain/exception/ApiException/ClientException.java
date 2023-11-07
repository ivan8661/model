package ru.poltorakov.domain.exception.ApiException;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.HashMap;

/**
 * An exception class representing client errors.
 * <p>
 * This exception class is used to handle client-related errors in the application. It provides information about the error type, message, and additional data.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
@JsonIgnoreProperties({"httpStatus", "stackTrace", "localizedMessage", "suppressed", "cause", "type"})
public class ClientException extends Exception implements ErrorResponseAnswer {

    @JsonIgnore
    private final UserExceptionType type;

    private final String message;
    private Object data;
    
    public ClientException(UserExceptionType type, String message) {
        this.type = type;
        this.message = message;
    }

    public ClientException(UserExceptionType type, Exception exception) {
        this.type = type;
        message = exception.getLocalizedMessage();
        HashMap<String, Object> debugInfo = new HashMap<>();
        debugInfo.put("message", exception.getMessage());
        debugInfo.put("stackTrace", exception.getStackTrace());
        debugInfo.put("class", exception.getClass().toString());
        System.out.println(debugInfo);
    }

    public ClientException(UserExceptionType type) {
        this.type = type;
        message = type.getDefaultMessage();
        System.out.println(Arrays.toString(getStackTrace()));
    }

    public int getId() {
        return type.getHTTPCode();
    }

    public String getCode() {
        return type.getCode();
    }

    public Object getData() {
        return data;
    }

    @Override
    public String getMessage() {
        if ( message != null && !message.isEmpty()) {
            return message;
        } else {
            return type != null ? type.getDefaultMessage() : null;
        }
    }

    public HttpStatus getHttpStatus() {
        return type.getHttpStatus();
    }
}


