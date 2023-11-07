package ru.poltorakov.domain.model.useraction;

import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * The {@code UserAction} class represents a user action in the application.
 * It includes information about the action type, action time, and associated player login.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public class UserAction {

    Action action;
    ZonedDateTime actionTime;
    String login;

    public UserAction() {

    }

    public UserAction(Action action, ZonedDateTime actionTime) {
        this.action = action;
        this.actionTime = actionTime;
    }

    /**
     * Constructs a new {@code UserAction} object with the specified action type, action time, and player login.
     * @param action The type of the user action.
     * @param actionTime The time at which the user action occurred.
     * @param login The login of the user associated with this action.
     */
    public UserAction(Action action, ZonedDateTime actionTime, String login) {
        this.action = action;
        this.actionTime = actionTime;
        this.login = login;
    }

    @Override
    public String toString() {
        return "action = " + action.getText() +"; action_time = " +actionTime;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public ZonedDateTime getActionTime() {
        return actionTime;
    }

    public void setActionTime(ZonedDateTime actionTime) {
        this.actionTime = actionTime;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAction that = (UserAction) o;

        if (action != that.action) return false;
        if (!Objects.equals(actionTime.getSecond(), that.actionTime.getSecond())) return false;
        return Objects.equals(login, that.login);
    }

    @Override
    public int hashCode() {
        int result = action != null ? action.hashCode() : 0;
        result = 31 * result + (actionTime != null ? actionTime.getMinute() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        return result;
    }
}
