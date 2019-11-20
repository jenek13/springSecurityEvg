package ru.ten.crud.service;

import ru.ten.crud.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService<T> {

    User selectUser(long id) ;
    List<User> listUser();
    void deleteUser(long id) ;
    void insertUser(User user);
    void updateUser(User user) ;

    User getUserByLogin(String login);
}
