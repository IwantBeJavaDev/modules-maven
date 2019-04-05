package guru.springframework;

import guru.springframework.domain.UserCommand;
import guru.springframework.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter {

    UserConverter INSTANCES = Mappers.getMapper(UserConverter.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand userCommand);
}
