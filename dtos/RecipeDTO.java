package com.upc.foodiabackend.dtos;

import com.upc.foodiabackend.entities.Ingredient;
import com.upc.foodiabackend.entities.Interactions;
import com.upc.foodiabackend.entities.RecipeCategory;
import com.upc.foodiabackend.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDTO {
    Long id;
    private String title;
    private String image;
    private String instructions;
    private Integer time;//for cooking
    private String description;
    private String type; //ex. vegetarian, vegan, etc.
    private Boolean favorite;
    private List<Ingredient> ingredients;
    private RecipeCategory recipeCategory;
    private List<Interactions>interactions;
    private User user;
}
