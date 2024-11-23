package com.unlockway.backendapplication.api.dto;

import com.unlockway.backendapplication.domain.enums.Biotype;
import com.unlockway.backendapplication.domain.models.UserModel;
import com.unlockway.backendapplication.domain.enums.Goals;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class UserDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private double height;
    private double weight;
    private Goals goals;
    private Biotype biotype;

    public UserDTO(UserModel entity){
        BeanUtils.copyProperties(entity, this);
    }
}
