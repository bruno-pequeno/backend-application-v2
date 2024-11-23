package com.unlockway.backendapplication.domain.models;

import com.unlockway.backendapplication.domain.enums.Biotype;
import com.unlockway.backendapplication.domain.enums.Goals;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_users")
public class UserModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_User")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password_user")
    private String password;

    private String email;

    private double height;

    private double weight;

    @Column(length = 40)
    @Enumerated(EnumType.STRING)
    private Goals goals;

    @Column(length = 40)
    @Enumerated(EnumType.STRING)
    private Biotype biotype;
}
