package ro.jademy.services;

import ro.jademy.userData.User;

import java.util.List;

public class MemoryAuthServiceImpl implements AuthService {

@Override
    public User login(List<User> users, User user) {
        for (User user1 : users) {
            if (user1.getName().equalsIgnoreCase(user.getName())) {
                if (user1.getPassword().equals(user.getPassword())) {

                    System.out.println("User successfully logged in: " + user1);
                    return user1;

                }
            }
        }

        return null;
    }

}
