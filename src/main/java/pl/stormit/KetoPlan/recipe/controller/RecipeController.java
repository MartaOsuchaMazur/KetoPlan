package pl.stormit.KetoPlan.recipe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.stormit.KetoPlan.recipe.domain.Recipe;
import pl.stormit.KetoPlan.recipe.service.RecipeService;

import java.util.List;

@RestController
@RequestMapping("recipes")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    List<Recipe>getRecipes(){
        return recipeService.getRecipes();
    }

    @GetMapping("/test")
    String test(@RequestParam String value){
        return recipeService.test(value);
    }
}
