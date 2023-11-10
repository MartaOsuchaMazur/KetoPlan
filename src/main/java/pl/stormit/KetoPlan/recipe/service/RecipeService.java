package pl.stormit.KetoPlan.recipe.service;

import org.springframework.stereotype.Service;
import pl.stormit.KetoPlan.RecipeConfiguration;
import pl.stormit.KetoPlan.recipe.domain.Recipe;

import java.util.Arrays;
import java.util.List;

@Service
public class RecipeService {

    private final RecipeConfiguration recipeConfiguration;

    public RecipeService(RecipeConfiguration recipeConfiguration) {
        this.recipeConfiguration = recipeConfiguration;
    }

    public List<Recipe> getRecipes() {
        return Arrays.asList(new Recipe("Recipe 1"), new Recipe("Recipe 2"));
    }

    public String test(String value) {
        return String.format("Hello %s %s", recipeConfiguration.getName(), value);
    }
}
