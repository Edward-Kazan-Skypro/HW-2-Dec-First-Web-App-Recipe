package skypro.learn.recipewebfirstapp.controllers;

import skypro.learn.recipewebfirstapp.model.Ingredient;
import skypro.learn.recipewebfirstapp.services.IngredientsService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController()
@RequestMapping("ingredients")
public class IngredientController {
    private final IngredientsService ingredientsService;

    public IngredientController(IngredientsService ingredientsService) {
        this.ingredientsService = ingredientsService;
    }

    @GetMapping("viewByID/{ingredientId}")
    public Ingredient findIngredientById(@PathVariable String ingredientId) {
        return ingredientsService.findIngredientById(Long.parseLong(ingredientId));
    }

    @PostMapping()
    public Map<Long, Ingredient> create(@RequestBody Ingredient ingredient) {
        return ingredientsService.addIngredient(ingredient.getIngredientID(), ingredient);
    }
}
