package com.upc.foodiabackend.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String title;
    private String image;
    private String instructions;
    private Integer time;//for cooking
    private String description;
    private String type; //ex. vegetarian, vegan, etc.
    private Boolean favorite;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "recipe_ingredient",joinColumns = @JoinColumn(name="recipe_id"),
            inverseJoinColumns = @JoinColumn(name="ingredient_id"))
    @JsonBackReference
    private Set<Ingredient> ingredients;

    @OneToOne
    @JoinColumn(name = "RecipeCategory_id")
    private RecipeCategory recipeCategory;

    @OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
    @JoinColumn(name="recipe_id")
    private List<Interactions> interactions=new ArrayList<>();
    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}
