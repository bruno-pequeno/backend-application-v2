package com.unlockway.backendapplication.services;

import com.unlockway.backendapplication.api.dto.CreateUserDTO;
import com.unlockway.backendapplication.api.dto.UserDTO;
import com.unlockway.backendapplication.domain.repositories.UserRepository;
import com.unlockway.backendapplication.domain.models.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordService hashPassword;

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

        String hashedPassword = hashPassword.hashPassword(createUserDTO.getPassword());
        newUser.setPassword(hashedPassword);

        newUser.setEmail(createUserDTO.getEmail());
        newUser.setHeight(createUserDTO.getHeight());
        newUser.setWeight(createUserDTO.getWeight());
        newUser.setGoals(createUserDTO.getGoals());
        newUser.setBiotype(createUserDTO.getBiotype());

        UserModel savedUserModel = userRepository.save(newUser);
        return new UserDTO(savedUserModel);
    }
}
