package pl.stormit.KetoPlan.recipe.domain;

import java.util.StringJoiner;

public class Recipe {

    private String name;

    public Recipe() {
    }

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Recipe.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
