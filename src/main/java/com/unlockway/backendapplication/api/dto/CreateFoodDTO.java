package com.unlockway.backendapplication.api.dto;

import com.unlockway.backendapplication.domain.enums.Measure;
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
