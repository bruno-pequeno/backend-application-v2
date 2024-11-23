package com.unlockway.backendapplication.domain.models;

import com.unlockway.backendapplication.domain.enums.Measure;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_foods")
public class FoodModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private double calories;

    private double proteins;

    private double water;

    private String minerals;

    private String vitamins;

    @Column(columnDefinition = "ENUM('AMOUNT', 'GRAMS', 'MILILITERS')")
    @Enumerated(EnumType.STRING)
    private Measure measure;

    private double fats;

    private String photo;
}
