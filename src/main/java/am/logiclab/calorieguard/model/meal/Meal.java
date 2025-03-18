package am.logiclab.calorieguard.model.meal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;   // Название
    private Double calories;   // Количество калорий на порцию
    private Double proteins;   // Белки
    private Double fats;       // Жиры
    private Double carbohydrates; // Углеводы


}

