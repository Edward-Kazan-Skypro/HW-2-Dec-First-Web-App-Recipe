package skypro.learn.recipewebfirstapp.repository;

import skypro.learn.recipewebfirstapp.model.Recipe;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RecipeRepository implements iRepository<Recipe> {
    private final Map<Long, Recipe> recipeStorage = new HashMap<>();

    @Override
    public Map<Long, Recipe> add(Long id, Recipe recipe) {
        if (!recipeStorage.containsKey(id) & recipe != null) {
            recipeStorage.put(id, recipe);
        }
        return recipeStorage;
    }

    @Override
    public Recipe findById(Long id) {
        return recipeStorage.getOrDefault(id, null);
    }
}

