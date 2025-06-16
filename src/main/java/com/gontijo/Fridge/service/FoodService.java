package com.gontijo.Fridge.service;

import com.gontijo.Fridge.model.Food;
import com.gontijo.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // Listar todos
    public List<Food> getFoods() {
        return foodRepository.findAll();
    }

    // Criar um novo alimento
    public Food save(Food food) {
        return foodRepository.save(food);
    }

    // Deletar um alimento
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }
}
