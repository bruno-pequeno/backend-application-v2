package com.unlockway.backendapplication.domain.repositories;

import com.unlockway.backendapplication.domain.models.FoodModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface FoodRepository extends JpaRepository<FoodModel, UUID> {
    List<FoodModel> findById(int UUID);
}
