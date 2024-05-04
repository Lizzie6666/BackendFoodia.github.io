package com.upc.foodiabackend.services;

import com.upc.foodiabackend.entities.Ingredient;

import java.util.List;

public interface IIngredientService {
    Ingredient save(Ingredient ingredient);
    List<Ingredient> list();
    Ingredient update(Ingredient ingredient);
    void delete(Long id);
}
