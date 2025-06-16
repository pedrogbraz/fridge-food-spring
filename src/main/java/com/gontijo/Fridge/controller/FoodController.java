package com.gontijo.Fridge.controller;

import com.gontijo.Fridge.model.Food;
import com.gontijo.Fridge.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {
    // Dependency injection
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getFoods() {
        return foodService.getFoods();
    }

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }
}
