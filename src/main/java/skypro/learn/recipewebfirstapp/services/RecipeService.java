package skypro.learn.recipewebfirstapp.services;

import skypro.learn.recipewebfirstapp.model.Recipe;
import skypro.learn.recipewebfirstapp.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe findRecipeById(Long recipeID) {
        Recipe recipe = recipeRepository.findById(recipeID);
        if (recipe == null) {
            throw new IllegalArgumentException();
        }
        return recipe;
    }

    public Map<Long, Recipe> addRecipe(Long recipeID, Recipe recipe) {
        return recipeRepository.add(recipeID, recipe);
    }
}
