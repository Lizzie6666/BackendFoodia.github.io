package com.upc.foodiabackend.servicesimplements;

import com.upc.foodiabackend.entities.Recipe;
import com.upc.foodiabackend.entities.RecipeCategory;
import com.upc.foodiabackend.repositories.RecipeRepository;
import com.upc.foodiabackend.services.IRecipeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecipeServiceImpl implements IRecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    @Transactional
    @Override
    public Recipe save(Recipe recipe){ return recipeRepository.save(recipe);}

    @Override
    public List<Recipe> search(String prefix)  {
        return recipeRepository.findRecipeByTitleStartingWith(prefix);
    }

    @Override
    public List<Recipe> list() { return recipeRepository.findAll();}

    @Override
    public Recipe update(Recipe recipe){
        recipeRepository.findById(recipe.getId());
        return recipeRepository.save(recipe);
    }

    @Transactional
    @Override
    public void delete(Long id){ recipeRepository.deleteById(id);}
    @Override
    public List<Recipe> filterByType(String type) { return recipeRepository.findRecipesByType(type);}

}
