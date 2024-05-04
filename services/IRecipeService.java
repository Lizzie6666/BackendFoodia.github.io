package com.upc.foodiabackend.services;

import com.upc.foodiabackend.entities.Recipe;

import java.util.List;

public interface IRecipeService {
    Recipe save(Recipe recipe);
    List<Recipe> search(String prefix);
    List<Recipe> list();
    void delete(Long id);
    Recipe update(Recipe recipe);
    List<Recipe>filterByType(String type);
}
