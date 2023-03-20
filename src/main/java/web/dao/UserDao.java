package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
List<User> getAllUsers();
User getUser(long id);
void saveUser(User user);
void updateUser(User user);
void deleteUser(long id);
}
