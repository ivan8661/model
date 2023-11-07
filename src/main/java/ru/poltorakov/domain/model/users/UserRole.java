package ru.poltorakov.domain.model.users;

/**
 * The {@code UserRole} enum represents the roles that users can have in the application.
 * It defines two roles: ADMIN and PLAYER.
 */
public enum UserRole {
    ADMIN("admin"),
    PLAYER("player");

    private final String text;

    UserRole(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
