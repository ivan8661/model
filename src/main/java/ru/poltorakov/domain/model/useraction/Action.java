package ru.poltorakov.domain.model.useraction;

/**
 * The {@code Action} enum represents various player actions that can be performed in the application.
 * Each action has an associated text description.
 *
 * @version 1.0.0
 * @author ivan@poltorakov.ru
 */
public enum Action {
    AUTHORIZATION ("authorization"),
    REGISTRATION ("registration"),
    CREDIT ("credit"),
    DEBIT ("debit"),
    BALANCE_CHECK("balance check"),
    LOG_OUT ("log out");
    private final String text;

    Action(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
