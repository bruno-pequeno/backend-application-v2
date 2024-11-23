package com.unlockway.backendapplication.api.dto;

import com.unlockway.backendapplication.domain.enums.Biotype;
import com.unlockway.backendapplication.domain.enums.Goals;
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
        private Biotype biotype;
}
