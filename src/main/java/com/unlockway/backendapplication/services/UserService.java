package com.unlockway.backendapplication.services;

import com.unlockway.backendapplication.dto.CreateUserDTO;
import com.unlockway.backendapplication.dto.UserDTO;
import com.unlockway.backendapplication.repositories.UserRepository;
import com.unlockway.backendapplication.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserDTO> findAll(){
        List<UserModel> result = userRepository.findAll();

        return result.stream().map(UserDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public List<UserDTO> findById(int id){
        List<UserModel> result = userRepository.findById(id);

        return result.stream().map(UserDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public UserDTO createUser(CreateUserDTO createUserDTO) {
        UserModel newUser = new UserModel();
        newUser.setFirstName(createUserDTO.getFirstName());
        newUser.setLastName(createUserDTO.getLastName());
        newUser.setPassword(createUserDTO.getPassword());
        newUser.setEmail(createUserDTO.getEmail());
        newUser.setHeight(createUserDTO.getHeight());
        newUser.setWeight(createUserDTO.getWeight());
        newUser.setGoals(createUserDTO.getGoals());

        UserModel savedUserModel = userRepository.save(newUser);

        return new UserDTO(savedUserModel);
    }
}
