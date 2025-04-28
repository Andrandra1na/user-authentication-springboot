package net.guides.springboot.registration_login_demo.service;

import java.util.List;

import net.guides.springboot.registration_login_demo.dto.UserDto;
import net.guides.springboot.registration_login_demo.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}