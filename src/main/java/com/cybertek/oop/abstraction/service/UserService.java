package com.cybertek.oop.abstraction.service;

import com.cybertek.enums.Gender;
import com.cybertek.oop.abstraction.implementation.UserServiceImplementation;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

public class UserService implements UserServiceImplementation {
    @Override
    public String userByRoleId(int id) {
        User user = new User("Mike","Smith",new Role(id,"Admin"), Gender.MALE);
        return user.getFirstName() + " " + user.getLastName();
    }
    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName,"Ally",new Role(5,"Employee"),Gender.MALE);
        return user;
    }
}
