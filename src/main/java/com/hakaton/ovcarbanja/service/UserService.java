package com.hakaton.ovcarbanja.service;

import com.hakaton.ovcarbanja.model.User;

public interface UserService {


    boolean createNewUser(User user);
    boolean userAlreadyExists(String email);
    User getUserByEmail(String email);
    User getUserByID(int id);


}
