package com.upc.foodiabackend.services;

import com.upc.foodiabackend.entities.RecipeCategory;

import java.util.List;

public interface IRecipeCategoryService {
    RecipeCategory save(RecipeCategory recipeCategory);
    List<RecipeCategory> list();
    RecipeCategory update(RecipeCategory recipeCategory);
    void delete(Long id);
    List<RecipeCategory> search(String name);
}
