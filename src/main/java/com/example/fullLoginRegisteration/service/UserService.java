package com.example.fullLoginRegisteration.service;

import java.util.List;

import com.example.fullLoginRegisteration.dto.UserDto;
import com.example.fullLoginRegisteration.model.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto>findAllUsers();
}
