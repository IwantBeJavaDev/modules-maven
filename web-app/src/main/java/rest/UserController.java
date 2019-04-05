package rest;

import guru.springframework.domain.UserCommand;
import guru.springframework.entity.User;

public class UserController {
    public User saveUser(UserCommand userCommand) {
        return new User();
    }
}
