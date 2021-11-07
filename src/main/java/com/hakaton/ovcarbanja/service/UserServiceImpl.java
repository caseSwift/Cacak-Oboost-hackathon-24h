package com.hakaton.ovcarbanja.service;


import com.hakaton.ovcarbanja.model.User;
import com.hakaton.ovcarbanja.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements  UserService{

    private final UserRepository userRepository;

    @Override
    public boolean createNewUser(User user) {
        if (!userAlreadyExists(user.getEmail())){
            user.setPassword(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(user.getPassword()));
            userRepository.save(user);
            return true;

        }return false;

    }

    @Override
    public boolean userAlreadyExists(String email) {
        return userRepository.findByEmail(email) != null;
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User getUserByID(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
