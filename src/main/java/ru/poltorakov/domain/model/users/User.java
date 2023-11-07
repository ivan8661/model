package ru.poltorakov.domain.model.users;

import java.math.BigDecimal;

/**
 * The {@code User} abstract class represents a user in the application.
 * It contains information about the user, including balance, login, password, and admin status.
 *
 * @author ivan@poltorakov.ru
 * @version 1.0.0
 */
public class User {

    protected BigDecimal balance;
    protected String login;
    protected String password;
    protected UserRole userRole;

    public User() {
        balance = BigDecimal.valueOf(0);
        userRole = UserRole.PLAYER;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        balance = BigDecimal.valueOf(0);
    }

    public User(String login, String password, UserRole userRole) {
        this.login = login;
        this.password = password;
        this.userRole = userRole;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "balance=" + balance +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return login.equals(user.login);
    }

    @Override
    public int hashCode() {
        return login.hashCode();
    }
}
