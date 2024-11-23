package com.unlockway.backendapplication.controllers;

import com.unlockway.backendapplication.dto.CreateFoodDTO;
import com.unlockway.backendapplication.dto.FoodDTO;
import com.unlockway.backendapplication.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/food")
public class FoodController {

    @Autowired
    FoodService foodService;

    @GetMapping(value = "/data")
    public List<FoodDTO> findAll(){
        List<FoodDTO> result = foodService.findAll();

        return result;
    }
    @GetMapping(value = "/{id}")
    public List<FoodDTO> findById(@PathVariable int id){
        List<FoodDTO> result = foodService.findById(id);

        return result;
    }
    @PostMapping(value = "/create")
    public FoodDTO createFood(@RequestBody CreateFoodDTO createFoodDTO) {
        FoodDTO createdFood = foodService.createFood(createFoodDTO);
        return createdFood;
    }
}
