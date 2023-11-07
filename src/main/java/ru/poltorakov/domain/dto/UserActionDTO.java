package ru.poltorakov.domain.dto;

/**
 * The {@code UserActionDTO} class represents a Data Transfer Object for user action-related information.
 * It is used for exchanging data between the client and server when recording user actions.
 * This class contains details about the user's action, including the action type, action time, and user login.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public class UserActionDTO {
    private String action;
    private String actionTime;
    private String login;

    public UserActionDTO() {
    }

    public UserActionDTO(String action, String actionTime, String login) {
        this.action = action;
        this.actionTime = actionTime;
        this.login = login;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
