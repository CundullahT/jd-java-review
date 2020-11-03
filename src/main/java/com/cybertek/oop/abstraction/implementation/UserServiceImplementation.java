package com.cybertek.oop.abstraction.implementation;

import com.cybertek.oop.encapsulation.User;

public interface UserServiceImplementation {

    String userByRoleId(int id);
    User userByFirstName(String firstName);

}
