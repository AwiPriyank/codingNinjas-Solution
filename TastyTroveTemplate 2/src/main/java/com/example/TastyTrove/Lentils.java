package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.List;

public class Lentils implements Ingredients {

    /** Given below are the 3 booleans based on the recipe type.
        These booleans by default will be false; however,
        based on the recipe type selected (setIngredient(String ingredient)),
        these booleans will become true accordingly.
    **/
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    /** Given below are 3 ArrayLists used to store the ingredients based on the recipe type. **/
    private List<String> chineseLentilsRecipes = new ArrayList<>();
    private List<String> northIndianLentilsRecipes = new ArrayList<>();
    private List<String> southIndianLentilsRecipes = new ArrayList<>();

    // Constructor to initialize the Lentils class
    public Lentils() {
        // Add your choice of ingredients in the lists based on the recipe type
        chineseLentilsRecipes.add("Soy Sauce");
        chineseLentilsRecipes.add("Black Bean Sauce");

        northIndianLentilsRecipes.add("Rice");
        northIndianLentilsRecipes.add("Salt");
        northIndianLentilsRecipes.add("Black Gram");

        southIndianLentilsRecipes.add("Lentils");
        southIndianLentilsRecipes.add("Turmeric");
        southIndianLentilsRecipes.add("Curry Leaves");
    }

    @Override
    public void setIngredient(String ingredient) {
        // Implement logic to set ingredient flags based on the ingredient type
        if (ingredient.equalsIgnoreCase("Soy Sauce") || ingredient.equalsIgnoreCase("Black Bean Sauce")) {
            isChinese = true;
        } else if (ingredient.equalsIgnoreCase("Rice") || ingredient.equalsIgnoreCase("Salt") || ingredient.equalsIgnoreCase("Black Gram")) {
            isNorthIndian = true;
        } else if (ingredient.equalsIgnoreCase("Lentils") || ingredient.equalsIgnoreCase("Turmeric") || ingredient.equalsIgnoreCase("Curry Leaves")) {
            isSouthIndian = true;
        }
    }

    @Override
    public String getDishDetail() {
        // Implement logic to return dish name based on the ingredient flags
        if (isChinese) {
            return "Chinese Lentils";
        } else if (isNorthIndian) {
            return "North Indian Lentils";
        } else if (isSouthIndian) {
            return "South Indian Lentils";
        }
        return "Unknown";
    }

    @Override
    public List<String> getIngredientsDetail() {
        // Implement logic to return ingredient list based on the ingredient flags
        if (isChinese) {
            return chineseLentilsRecipes;
        } else if (isNorthIndian) {
            return northIndianLentilsRecipes;
        } else if (isSouthIndian) {
            return southIndianLentilsRecipes;
        }
        return new ArrayList<>();
    }
}

