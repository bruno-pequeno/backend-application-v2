package com.unlockway.backendapplication.repositories;

import com.unlockway.backendapplication.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FoodRepository extends JpaRepository<FoodModel, UUID> {
    List<FoodModel> findById(int UUID);
}
