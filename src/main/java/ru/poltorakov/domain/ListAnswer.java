package ru.poltorakov.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The {@code ListAnswer} class represents a standardized response format for lists of items. It includes
 * a total count of items and the list of items as its properties. The class is parameterized with the type
 * of items in the list.
 * @param <T> The type of items in the list.
 * @version 1.0.0
 * @author ivan@poltorakov.ru
 */
public class ListAnswer<T> {

    @JsonProperty("totalCount")
    private long totalCount;
    @JsonProperty("items")
    private List<T> listAnswer;

    @Deprecated
    public ListAnswer(){}

    public ListAnswer(List<T> listAnswer, long totalCount) {
        this.totalCount = totalCount;
        this.listAnswer = listAnswer;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public List<T> getListAnswer() {
        return listAnswer;
    }

    @Override
    public String toString() {
        return "ListAnswer{" +
                "totalCount=" + totalCount +
                "listAnswer=" + listAnswer +
                '}';
    }
}
