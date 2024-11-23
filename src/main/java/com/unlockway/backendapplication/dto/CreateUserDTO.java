package com.unlockway.backendapplication.dto;

import com.unlockway.backendapplication.enums.Goals;

public class CreateUserDTO {
        private String firstName;
        private String lastName;
        private String password;
        private String email;
        private double height;
        private double weight;
        private Goals goals;

    public CreateUserDTO() {

    }

    public CreateUserDTO(String firstName, String lastName, String password, String email, double height, double weight, Goals goals) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.goals = goals;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }
}
