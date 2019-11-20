package ru.ten.crud.dao;

import ru.ten.crud.model.User;
import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    void addUser(User user);

    void editUser(User user) throws SQLException;

    void removeUser(long id) throws SQLException;

    User getUserById(long id) throws SQLException;

    List selectAllUsers();

    User getUserByLogin(String login);

}
