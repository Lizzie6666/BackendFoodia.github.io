package com.upc.foodiabackend.repositories;

import com.upc.foodiabackend.entities.Ingredient;
import com.upc.foodiabackend.entities.IngredientCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient,Long> {

}
