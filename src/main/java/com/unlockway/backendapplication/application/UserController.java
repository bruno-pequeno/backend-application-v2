package com.unlockway.backendapplication.application;

import com.unlockway.backendapplication.api.dto.CreateUserDTO;
import com.unlockway.backendapplication.api.dto.UserDTO;
import com.unlockway.backendapplication.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    @GetMapping(value = "")
    public List<UserDTO> findAll(){
        return userService.findAll();
    }

    @GetMapping(value = "/{id}")
    public List<UserDTO> findById(@PathVariable int id){
        return userService.findById(id);
    }

    @PostMapping(value = "")
    public UserDTO createUser(@RequestBody CreateUserDTO createUserDTO) {
        return userService.createUser(createUserDTO);
    }
}
