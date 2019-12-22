package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

public interface UserService {
    void deleteUser(Integer id);

    User findOne(Integer id);

    void saveUser(User user);

    List<User> findAll();

    void updateUser(User user);
}
