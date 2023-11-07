package ru.poltorakov.domain.mapper;

import org.mapstruct.Mapper;
import ru.poltorakov.domain.dto.UserActionDTO;
import ru.poltorakov.domain.model.useraction.UserAction;

import java.util.List;

/**
 * The {@code UserActionMapper} interface is used for mapping between {@link UserAction} and {@link UserActionDTO} objects.
 * It provides methods for converting user action-related data between different representations.
 * @version 1.0.0
 * @author ivan@poltorakov.ru
 */
@Mapper(componentModel = "spring", uses = ZonedDateTimeMapper.class)
public interface UserActionMapper {

    UserActionDTO toUserActionDTO(UserAction userAction);

    List<UserActionDTO> toUserActionDTOList(List<UserAction> userActions);

    UserAction toUserAction(UserActionDTO userActionDTO);
}
