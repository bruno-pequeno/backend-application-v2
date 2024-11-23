package com.unlockway.backendapplication.dto;

import com.unlockway.backendapplication.enums.Measure;
import lombok.Data;

@Data
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
}
