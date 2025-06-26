package edu.allan.StartSpring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import edu.allan.StartSpring.service.FoodService;
import edu.allan.StartSpring.model.Food;
import java.util.List;
import java.time.LocalDateTime;

@RestController // Anotation para indicar que esta classe é um controller,
// Camada responsável pelas rotas da aplicação,
@RequestMapping("/food") //Anotation para mapear a URL base do controller
// Exemplo: http://localhost:8080/food
public class FoodController {

    // Injeção de dependência do FoodService
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    
    @GetMapping("/list-all") // Mapeia a URL /food/list-all para este método
    public List<Food> getAll() {
        return foodService.getAll();
    }

    @GetMapping("/list-id/{id}") // Mapeia a URL /food/list-id/{id} para este método
    public Food getById(@PathVariable Long id) {
        return foodService.getById(id);
    }

    @PostMapping("/addFood") // Mapeia a URL /food/addFood para este método
    public Food createFood (@RequestBody Food food) {
        return foodService.createFood(food);
    }

    @PostMapping("/add-url")
    public Food createFoodFromUrl (@RequestParam String name,
                                   @RequestParam Integer quantity,
                                   @RequestParam Double calories,
                                   @RequestParam String expirationDate) {
                                
        Food food = new Food(name, quantity, calories, LocalDateTime.parse(expirationDate));
        return foodService.createFood(food);                           
    }

    @DeleteMapping("/delete-all")
    public void delete() {
        foodService.deleteAll();
    }

    @DeleteMapping("/delete-id/{id}") // Mapeia a URL /food/delete-id/{id} para este método
    public void deleteById(@PathVariable Long id) {
        foodService.deleteById(id);
    }

}
