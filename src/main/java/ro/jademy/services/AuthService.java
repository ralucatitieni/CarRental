package ro.jademy.services;

import ro.jademy.userData.User;

import java.util.List;

public interface AuthService {

    User login(List<User> users, User user);

}
