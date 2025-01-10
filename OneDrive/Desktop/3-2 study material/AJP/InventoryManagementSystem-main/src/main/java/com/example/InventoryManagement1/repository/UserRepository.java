package com.example.InventoryManagement1.repository;

import com.example.InventoryManagement1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
