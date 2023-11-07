package ru.poltorakov.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import ru.poltorakov.domain.model.users.UserRole;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
 * The {@code UserActionDTO} class represents a Data Transfer Object for user action-related information.
 * It is used for exchanging data between the client and server when recording user actions.
 * This class contains details about the user's action, including the action type, action time, and user login.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {

    @NotNull
    private BigDecimal balance;
    @NotNull
    private String login;
    private UserRole userRole;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull
    @Size(min = 8)
    private String password;

    public UserDTO() {
    }

    public UserDTO(BigDecimal balance, String login, UserRole userRole, String password) {
        this.balance = balance;
        this.login = login;
        this.userRole = userRole;
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "balance=" + balance +
                ", login='" + login + '\'' +
                '}';
    }
}
