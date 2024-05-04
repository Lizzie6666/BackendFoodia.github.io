package com.upc.foodiabackend.dtos;

import com.upc.foodiabackend.entities.IngredientCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientDTO {
    private Long id;
    private String name;
    private Long calories;
    private IngredientCategory ingredientCategory;

}
