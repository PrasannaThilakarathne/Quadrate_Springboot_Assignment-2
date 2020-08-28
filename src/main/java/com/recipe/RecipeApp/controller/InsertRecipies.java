package com.recipe.RecipeApp.controller;

import com.recipe.RecipeApp.models.Recipe;
import com.recipe.RecipeApp.repositories.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertRecipies implements CommandLineRunner {

    private final RecipeRepository recipeRepository;

    public InsertRecipies(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Recipe recp1 = new Recipe();
        recp1.setRid("R01");
        recp1.setTitle("Buriyani");
        recp1.setDescription("Ingradians and steps.....");

        recipeRepository.save(recp1);
    }
}
