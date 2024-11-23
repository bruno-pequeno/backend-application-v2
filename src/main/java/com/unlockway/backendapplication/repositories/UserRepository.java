package com.unlockway.backendapplication.repositories;

import com.unlockway.backendapplication.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {

    List<UserModel> findById(int UUID);
}
