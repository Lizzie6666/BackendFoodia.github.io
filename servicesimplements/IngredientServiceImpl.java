package com.upc.foodiabackend.servicesimplements;

import com.upc.foodiabackend.entities.Ingredient;
import com.upc.foodiabackend.repositories.IngredientRepository;
import com.upc.foodiabackend.services.IIngredientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IIngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;

    @Transactional
    @Override
    public Ingredient save(Ingredient ingredient){
        return ingredientRepository.save(ingredient);
    }
    @Override
    public List<Ingredient> list(){
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        ingredientRepository.findById(ingredient.getId());
        return ingredientRepository.save(ingredient);
    }

    @Transactional
    @Override
    public void delete(Long id){ ingredientRepository.deleteById(id);}
}
