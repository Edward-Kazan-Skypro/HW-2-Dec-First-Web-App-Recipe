package skypro.learn.recipewebfirstapp.controllers;

import skypro.learn.recipewebfirstapp.model.Recipe;
import skypro.learn.recipewebfirstapp.services.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController()
@RequestMapping("recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("viewByID/{recipeId}")
    public Recipe findRecipeById(@PathVariable String recipeId) {
        return recipeService.findRecipeById(Long.parseLong(recipeId));
    }

    @PostMapping()
    public Map<Long, Recipe> create(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe.getRecipeID(), recipe);
    }
}
