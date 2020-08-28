package com.recipe.RecipeApp.controller;

import com.recipe.RecipeApp.models.Recipe;
import com.recipe.RecipeApp.models.User;
import com.recipe.RecipeApp.repositories.RecipeRepository;
import com.recipe.RecipeApp.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertRecipies implements CommandLineRunner {

    private final RecipeRepository recipeRepository;
    private final UserRepository userRepository;

    public InsertRecipies(RecipeRepository recipeRepository, UserRepository userRepository) {
        this.recipeRepository = recipeRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Recipe recp1 = new Recipe();
        recp1.setRid("R01");
        recp1.setTitle("Buriyani");
        recp1.setDescription("Ingradians and steps.....");

        User user1 = new User();
        user1.setF_name("Silva");
        user1.setL_name("ljd");

        recipeRepository.save(recp1);
        userRepository.save(user1);
    }
}
