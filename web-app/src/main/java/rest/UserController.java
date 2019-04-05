package rest;

import guru.springframework.UserConverter;
import guru.springframework.domain.UserCommand;
import guru.springframework.entity.User;

public class UserController {
    public User saveUser(UserCommand userCommand) {
        return  UserConverter.INSTANCES.userCommandToUser(userCommand);
    }
}
