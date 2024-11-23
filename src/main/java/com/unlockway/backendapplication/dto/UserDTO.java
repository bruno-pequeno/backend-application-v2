package com.unlockway.backendapplication.dto;

import com.unlockway.backendapplication.models.UserModel;
import com.unlockway.backendapplication.enums.Goals;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class UserDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String height;
    private String weight;
    private Goals goals;

    public UserDTO(UserModel entity){
        BeanUtils.copyProperties(entity, this);
    }
}
