package edu.allan.StartSpring.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // Anotation que indica que esta classe será uma entidade no meu banco de dados
@Table(name = "foods")  // Anotation que indica o nome da tabela no banco de dados
public class Food {

    @Id // Anotation que indica que este campo é a chave primária da tabela 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Anotation que indica que o valor deste campo será gerado automaticamente pelo banco de dados
    // O strategy indica que o banco de dados irá gerar o valor automaticamente, no caso do MySQL, ele irá gerar um valor auto-incremental
    // O GenerationType.IDENTITY é usado para indicar que o banco de dados irá gerar o valor
    private Long id;
    private String name;
    private Integer quantity;
    private Double calories;
    private LocalDateTime expirationDate;

    public Food() {

    }

    public Food(String name, Integer quantity, Double calories, LocalDateTime expirationDate) {
        this.name = name;
        this.quantity = quantity;
        this.calories = calories;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getCalories() {
        return calories;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

}

