package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
List<User> getAllUsers();
User getUser(long id);
void saveUser(User user);
void updateUser(User user);
void deleteUser(long id);
}
