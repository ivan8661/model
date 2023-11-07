package ru.poltorakov.domain;

import ru.poltorakov.domain.exception.ApiException.ErrorResponseAnswer;

/**
 * The {@code AnswerTemplate} class is a generic class representing a standardized response template
 * for servlet endpoints. It can encapsulate both a result object and an error object in the response.
 * @param <T> The type of the result object.
 *
 * @version 1.0.0
 * @author ivan@poltorakov.ru
 */
public class AnswerTemplate<T> {

    private final T result;

    private final ErrorResponseAnswer error;

    public AnswerTemplate(T result, ErrorResponseAnswer error) {
        this.result = result;
        this.error = error;
    }

    public T getResult() {
        return result;
    }

    public ErrorResponseAnswer getError() {
        return error;
    }
}
