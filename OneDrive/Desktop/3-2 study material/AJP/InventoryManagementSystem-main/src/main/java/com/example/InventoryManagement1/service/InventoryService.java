package com.example.InventoryManagement1.service;

import com.example.InventoryManagement1.model.Inventory;
import com.example.InventoryManagement1.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public void addProduct(Inventory inventory) {
        inventoryRepository.save(inventory);
    }

    public List<Inventory> getProductsInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getProductsInventoryById(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public Inventory updateProductsInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public void deleteProductsInventoryBasedOnId(Long id) {
        inventoryRepository.deleteById(id);
    }

}
