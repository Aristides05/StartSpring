package edu.allan.StartSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.allan.StartSpring.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
