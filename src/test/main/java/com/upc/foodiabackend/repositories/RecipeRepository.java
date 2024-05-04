package com.upc.foodiabackend.repositories;

import com.upc.foodiabackend.entities.Recipe;
import com.upc.foodiabackend.entities.RecipeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe,Long> {
    public List<Recipe> findRecipeByTitleStartingWith(String prefix);
    public List<Recipe>findRecipesByType(String type);

    //@Query ("SELECT r FROM Recipe r"+)
    //public List<Recipe>findRecipesByUserIsStartingWith(String username);
    //@Query("SELECT r FROM Recipe r " +
    //        "JOIN recipe_ingredient ir ON r.idReceta = ir.receta.idReceta " +
    //        "WHERE ir.nombreIngrediente = :nombreIngrediente")
    //List<Recipe> searchByIngredient(@Param("name") String name);

}
