package com.upc.foodiabackend.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientCategoryDTO {
    private Long id;
    private String name;
}
