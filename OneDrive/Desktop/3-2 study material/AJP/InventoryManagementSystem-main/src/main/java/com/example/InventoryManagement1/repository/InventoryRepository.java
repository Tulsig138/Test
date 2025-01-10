package com.example.InventoryManagement1.repository;

import com.example.InventoryManagement1.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
