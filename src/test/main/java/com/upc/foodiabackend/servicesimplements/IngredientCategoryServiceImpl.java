package com.upc.foodiabackend.servicesimplements;

import com.upc.foodiabackend.entities.IngredientCategory;
import com.upc.foodiabackend.entities.Recipe;
import com.upc.foodiabackend.repositories.IngredientCategoryRepository;
import com.upc.foodiabackend.services.IIngredientCategoryService;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredientCategoryServiceImpl implements IIngredientCategoryService {

    @Autowired
    private IngredientCategoryRepository ingredientCategoryRepository;

    @Transactional
    @Override
    public IngredientCategory save(IngredientCategory ingredientCategory){
        return ingredientCategoryRepository.save(ingredientCategory);}
    @Override
    public List<IngredientCategory>list(){ return ingredientCategoryRepository.findAll();}

     @Override
     public IngredientCategory update(IngredientCategory ingredientCategory){
         ingredientCategoryRepository.findById(ingredientCategory.getId());
        return ingredientCategoryRepository.save(ingredientCategory);
    }

    @Transactional
    @Override
    public void delete(Long id){ ingredientCategoryRepository.deleteById(id);}


}
