package com.unlockway.backendapplication.application;

import com.unlockway.backendapplication.api.dto.CreateFoodDTO;
import com.unlockway.backendapplication.api.dto.FoodDTO;
import com.unlockway.backendapplication.domain.models.FoodModel;
import com.unlockway.backendapplication.services.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<FoodDTO> createFood(@RequestBody CreateFoodDTO createFoodDTO) {
            FoodDTO foodCreated = foodService.createFood(createFoodDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(foodCreated);
    }
}
