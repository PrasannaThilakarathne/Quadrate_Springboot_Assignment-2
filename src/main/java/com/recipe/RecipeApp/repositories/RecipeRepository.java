package com.recipe.RecipeApp.repositories;

import com.recipe.RecipeApp.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
