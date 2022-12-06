package skypro.learn.recipewebfirstapp.services;

import skypro.learn.recipewebfirstapp.model.Ingredient;
import skypro.learn.recipewebfirstapp.repository.IngredientsRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IngredientsService {
    private final IngredientsRepository ingredientsRepository;

    public IngredientsService(IngredientsRepository ingredientsRepository) {
        this.ingredientsRepository = ingredientsRepository;
    }

    public Ingredient findIngredientById(Long ingredientId) {
        return ingredientsRepository.findById(ingredientId);
    }

    public Map<Long, Ingredient> addIngredient(Long ingredientID, Ingredient ingredient) {
        return ingredientsRepository.add(ingredientID, ingredient);
    }
}
