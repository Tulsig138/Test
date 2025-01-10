package com.example.InventoryManagement1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Inventory {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private String productName;
    private long stock;

    private double ratings;
    private long itemsSold;
    private double revenueGenerated;

    // ratings from 1 to 5
    // items sold
    // revenue generated

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public long getStock() {
        return stock;
    }

    public double getRatings() {
        return ratings;
    }

    public long getItemsSold() {
        return itemsSold;
    }

    public double getRevenueGenerated() {
        return revenueGenerated;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public void setItemsSold(long itemsSold) {
        this.itemsSold = itemsSold;
    }

    public void setRevenueGenerated(double revenueGenerated) {
        this.revenueGenerated = revenueGenerated;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", stock=" + stock +
                ", ratings=" + ratings +
                ", itemsSold=" + itemsSold +
                ", revenueGenerated=" + revenueGenerated +
                '}';
    }
}
