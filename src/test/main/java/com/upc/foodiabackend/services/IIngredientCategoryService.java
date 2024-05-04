package com.upc.foodiabackend.services;

import com.upc.foodiabackend.entities.IngredientCategory;

import java.util.List;

public interface IIngredientCategoryService {
    public IngredientCategory save(IngredientCategory ingredientCategory);
    List<IngredientCategory> list();
    public IngredientCategory update(IngredientCategory ingredientCategory);
    public void  delete(Long id);
}
