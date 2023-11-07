package ru.poltorakov.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.poltorakov.domain.dto.UserDTO;
import ru.poltorakov.domain.model.users.User;

/**
 * The {@code UserMapper} interface is used for mapping between {@link User} and {@link UserDTO} objects.
 * It provides methods for converting user-related data between different representations.
 *
 * @version 1.0.0
 * @author ivan@poltorakov.ru
 */
@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "password", ignore = true)
    UserDTO toUserDTO(User user);

    @Mapping(target = "balance", ignore = true)
    @Mapping(target = "userRole", ignore = true)
    User toUser(UserDTO userDTO);
}
