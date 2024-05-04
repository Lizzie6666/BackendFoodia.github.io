package com.upc.foodiabackend.servicesimplements;


import com.upc.foodiabackend.entities.RecipeCategory;
import com.upc.foodiabackend.services.IRecipeCategoryService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.upc.foodiabackend.repositories.RecipeCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecipeCategoryServiceImpl implements IRecipeCategoryService {
    @Autowired
    private  RecipeCategoryRepository recipeCategoryRepository;

    @Transactional
    @Override
    public  RecipeCategory save(RecipeCategory recipeCategory){
        return recipeCategoryRepository.save(recipeCategory);
    }
    @Override
    public List<RecipeCategory> list(){
        return recipeCategoryRepository.findAll();
    }


    @Override
    public RecipeCategory update(RecipeCategory recipeCategory) {
        recipeCategoryRepository.findById(recipeCategory.getId());
        return recipeCategoryRepository.save(recipeCategory);
    }

    @Transactional
    @Override
    public void delete(Long id){ recipeCategoryRepository.deleteById(id);}

    @Override
    public List<RecipeCategory> search(String name){
        return recipeCategoryRepository.findAllByNameStartingWith(name);
    }


}
