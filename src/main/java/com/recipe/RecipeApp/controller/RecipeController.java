package com.recipe.RecipeApp.controller;

import com.recipe.RecipeApp.repositories.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping("/recipes")
    public String getRecipes(Model model){

        model.addAttribute("recipes", recipeRepository.findAll());

        return "recipes/home";
    }
}
