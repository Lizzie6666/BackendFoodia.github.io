package com.upc.foodiabackend.repositories;

import com.upc.foodiabackend.entities.RecipeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeCategoryRepository extends JpaRepository<RecipeCategory, Long> {
    List<RecipeCategory> findAllByNameStartingWith(String name);


}
