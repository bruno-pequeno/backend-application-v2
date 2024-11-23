package com.unlockway.backendapplication.dto;

import com.unlockway.backendapplication.enums.Measure;
import com.unlockway.backendapplication.models.FoodModel;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class FoodDTO {
    private int id;
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

    public FoodDTO(FoodModel entity){
        BeanUtils.copyProperties(entity, this);
    }
}
