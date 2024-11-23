package com.unlockway.backendapplication.dto;

import com.unlockway.backendapplication.enums.Measure;

public class CreateFoodDTO {
    private String name;
    private String description;
    private double calories;
    private double proteins;
    private double water;
    private String minerals;
    private String vitamins;
    private Measure measure;
    private double fats;
    private String photo;

    public CreateFoodDTO() {

    }

    public CreateFoodDTO(String name, String description, double calories, double proteins, double water, String minerals, String vitamins, Measure measure, double fats, String photo) {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.proteins = proteins;
        this.water = water;
        this.minerals = minerals;
        this.vitamins = vitamins;
        this.measure = measure;
        this.fats = fats;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public String getMinerals() {
        return minerals;
    }

    public void setMinerals(String minerals) {
        this.minerals = minerals;
    }

    public String getVitamins() {
        return vitamins;
    }

    public void setVitamins(String vitamins) {
        this.vitamins = vitamins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
