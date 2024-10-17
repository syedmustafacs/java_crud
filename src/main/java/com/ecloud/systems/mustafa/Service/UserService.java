package com.ecloud.systems.mustafa.Service;

import com.ecloud.systems.mustafa.Model.User;
import com.ecloud.systems.mustafa.Repository.UserRepository;
import com.ecloud.systems.mustafa.Utility.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return  userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){

        return userRepository.findById(id);

    }

    public User createUser(User user){
        user.setPassword(PasswordUtils.hashPassword(user.getPassword()));
        return  userRepository.save(user);
    }
    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow();
        user.setPassword(PasswordUtils.hashPassword(userDetails.getPassword()));
        user.setUsername(userDetails.getUsername());
        user.setActive(userDetails.getActive());
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
