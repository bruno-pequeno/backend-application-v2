package com.unlockway.backendapplication.controllers;

import com.unlockway.backendapplication.dto.CreateUserDTO;
import com.unlockway.backendapplication.dto.UserDTO;
import com.unlockway.backendapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/data")
    public List<UserDTO> findAll(){
        List<UserDTO> result = userService.findAll();

        return result;
    }
    @GetMapping(value = "/{id}")
    public List<UserDTO> findById(@PathVariable int id){
        List<UserDTO> result = userService.findById(id);

        return result;
    }
    @PostMapping(value = "/create")
    public UserDTO createUser(@RequestBody CreateUserDTO createUserDTO) {
        UserDTO createdUser = userService.createUser(createUserDTO);
        return createdUser;
    }
}
