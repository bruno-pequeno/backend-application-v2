package com.unlockway.backendapplication.dto;

import com.unlockway.backendapplication.enums.Goals;
import lombok.Data;

@Data
public class CreateUserDTO {
        private String firstName;
        private String lastName;
        private String password;
        private String email;
        private double height;
        private double weight;
        private Goals goals;
}
