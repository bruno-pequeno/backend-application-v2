package com.unlockway.backendapplication.dto;

import com.unlockway.backendapplication.UserModel;
import com.unlockway.backendapplication.enums.Goals;
import org.springframework.beans.BeanUtils;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }
}
