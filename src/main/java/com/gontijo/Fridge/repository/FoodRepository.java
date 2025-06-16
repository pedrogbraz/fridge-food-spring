package com.gontijo.Fridge.repository;

import com.gontijo.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
