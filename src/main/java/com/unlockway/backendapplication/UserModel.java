package com.unlockway.backendapplication;

import com.unlockway.backendapplication.enums.Biotype;
import com.unlockway.backendapplication.enums.Goals;
import jakarta.persistence.*;

@Entity
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

    public int getId() {
        return id;
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

    public void setGoals(Goals goal) {
        this.goals = goal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Biotype getBiotype() {
        return biotype;
    }

    public void setBiotype(Biotype biotype) {
        this.biotype = biotype;
    }

    public UserModel(int id, String firstName, String lastName, String password, String email, double height, double weight, Goals goals, Biotype biotype) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.goals = goals;
        this.biotype = biotype;
    }

    public UserModel() {

    }
}
