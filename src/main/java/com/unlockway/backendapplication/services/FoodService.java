package com.unlockway.backendapplication.services;

import com.unlockway.backendapplication.dto.CreateFoodDTO;
import com.unlockway.backendapplication.dto.FoodDTO;
import com.unlockway.backendapplication.repositories.FoodRepository;
import com.unlockway.backendapplication.models.FoodModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    @Transactional(readOnly = true)
    public List<FoodDTO> findAll(){
        List<FoodModel> result = foodRepository.findAll();

        return result.stream().map(FoodDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<FoodDTO> findById(int id){
        List<FoodModel> result = foodRepository.findById(id);

        return result.stream().map(FoodDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public FoodDTO createFood(CreateFoodDTO createFoodDTO) {
        FoodModel newFood = new FoodModel();

        newFood.setName(createFoodDTO.getName());
        newFood.setDescription(createFoodDTO.getDescription());
        newFood.setCalories(createFoodDTO.getCalories());
        newFood.setProteins(createFoodDTO.getProteins());
        newFood.setWater(createFoodDTO.getWater());
        newFood.setMinerals(createFoodDTO.getMinerals());
        newFood.setVitamins(createFoodDTO.getVitamins());
        newFood.setMeasure(createFoodDTO.getMeasure());
        newFood.setFats(createFoodDTO.getFats());
        newFood.setPhoto(createFoodDTO.getPhoto());

        FoodModel savedFoodModel = foodRepository.save(newFood);
        return new FoodDTO(savedFoodModel);
    }
}
