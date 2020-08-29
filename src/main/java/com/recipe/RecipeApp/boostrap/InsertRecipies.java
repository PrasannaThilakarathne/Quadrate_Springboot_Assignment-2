package com.recipe.RecipeApp.boostrap;

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
        recp1.setTitle("Biryani");
        recp1.setDescription("Ingradians and steps.....");

        Recipe recp2 = new Recipe();
        recp2.setRid("R02");
        recp2.setTitle("Gateau");
        recp2.setDescription("Ingradians and steps.....");

        User user1 = new User();
        user1.setF_name("Nevil");
        user1.setL_name("Silva");

        User user2 = new User();
        user2.setF_name("Nisal");
        user2.setL_name("Perera");

        recipeRepository.save(recp1);
        userRepository.save(user1);
        recipeRepository.save(recp2);
        userRepository.save(user2);
    }
}
