package edu.allan.StartSpring.service;

import org.springframework.stereotype.Service;

import edu.allan.StartSpring.model.Food;
import edu.allan.StartSpring.repository.FoodRepository;
import java.util.List;

@Service // Anotation que indica que esta classe é um serviço
// Camada responsável pelas regras de negocio da aplicação, basicamente são as "ações" que algum ojeto pode fazer
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }


    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    public Food getById(Long id) {
        return foodRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nenhum alimento encontrado com id: " + id));
    }

    public void deleteAll() {
        foodRepository.deleteAll();
    }

    public void deleteById(Long id) {
        foodRepository.deleteById(id);
    }

    public Food createFood(Food food) {
        return foodRepository.save(food);
    }
    
}
