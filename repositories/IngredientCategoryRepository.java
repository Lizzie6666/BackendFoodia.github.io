package com.upc.foodiabackend.repositories;

import com.upc.foodiabackend.entities.IngredientCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientCategoryRepository extends JpaRepository<IngredientCategory,Long> {


}
