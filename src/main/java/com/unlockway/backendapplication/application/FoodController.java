package com.unlockway.backendapplication.application;

import com.unlockway.backendapplication.api.dto.CreateFoodDTO;
import com.unlockway.backendapplication.api.dto.FoodDTO;
import com.unlockway.backendapplication.services.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/food")
public class FoodController {

    private final FoodService foodService;

    @GetMapping(value = "")
    public List<FoodDTO> findAll(){
        return foodService.findAll();
    }
    @GetMapping(value = "/{id}")
    public List<FoodDTO> findById(@PathVariable int id){
        return foodService.findById(id);
    }
    @PostMapping(value = "")
    public FoodDTO createFood(@RequestBody CreateFoodDTO createFoodDTO) {
        return foodService.createFood(createFoodDTO);
    }
}
