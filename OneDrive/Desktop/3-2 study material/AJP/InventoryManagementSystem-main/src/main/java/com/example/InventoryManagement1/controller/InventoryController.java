package com.example.InventoryManagement1.controller;

import com.example.InventoryManagement1.service.InventoryService;
import com.example.InventoryManagement1.model.Inventory;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @PostMapping("/addToDB")
    public String addToDB(Inventory inventory) {

        inventoryService.addProduct(inventory);
        return "addSuccess";
    }

    @GetMapping("/productsInventory")
    public String displayProductsInventory(Model model, HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";

        List<Inventory> products = inventoryService.getProductsInventory();
        model.addAttribute("products", products);
        return "allProductsInventory";
    }

    @GetMapping("/editProductDetails/{id}/")
    public String editProductDetails(@PathVariable("id") Long id, Model model, HttpSession session){
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";

        Inventory inventory = inventoryService.getProductsInventoryById(id);

        if (inventory != null) {
            model.addAttribute("product", inventory);
        }
        return "updateProduct";
    }

    @PostMapping("/editProductDetails/{id}/update")
    public String updateProduct(@PathVariable("id") Long id, Inventory inventory) {
        Inventory existingProduct = inventoryService.getProductsInventoryById(id);
        System.out.println("Product : " + id +existingProduct.getId() + existingProduct.getProductName());
        if (existingProduct != null) {
            // user.setId(id);
            Inventory updatedProductInventory = inventoryService.updateProductsInventory(inventory);
            if (updatedProductInventory != null) {
                return "updateSuccess";
            }
        } else {
            System.out.println("product id not found");

        }
        return "error";
    }

    // @GetMapping("")

    @GetMapping("/delete/{id}/")
    public String deleteProduct(@PathVariable("id") Long id, HttpSession session) {
        String username = (String) session.getAttribute("username");
        if (username == null)
            return "redirect:/login";

        inventoryService.deleteProductsInventoryBasedOnId(id);
        return "deleteSuccess";
    }



}
