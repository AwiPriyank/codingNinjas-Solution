package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.List;

public class Wheat implements Ingredients {

    // Given below are the 3 booleans based on the recipe type.
    // These booleans by default will be false, however, based on recipe type selected (setIngredient(String ingredient)), this boolean will become true accordingly.
    private boolean isChinese = false;
    private boolean isNorthIndian = false;
    private boolean isSouthIndian = false;

    // Given below are 3 ArrayList which are used to store the ingredients of your choice based
    // on the recipe type. Refer to point number 2 above.
    private List<String> chineseWheatRecipe = new ArrayList<>();
    private List<String> northIndianWheatRecipe = new ArrayList<>();
    private List<String> southIndianWheatRecipe = new ArrayList<>();

    // Constructor to add ingredients to the appropriate lists based on the type of recipe
    public Wheat() {
        // Add your choice of ingredients for Chinese Wheat recipe
        chineseWheatRecipe.add("Flour");
        chineseWheatRecipe.add("Soy Sauce");
        chineseWheatRecipe.add("Vegetables");

        // Add your choice of ingredients for North Indian Wheat recipe
        northIndianWheatRecipe.add("Flour");
        northIndianWheatRecipe.add("Water");
        northIndianWheatRecipe.add("Salt");

        // Add your choice of ingredients for South Indian Wheat recipe
        southIndianWheatRecipe.add("Flour");
        southIndianWheatRecipe.add("Water");
        southIndianWheatRecipe.add("Salt");
    }

    @Override
    public void setIngredient(String ingredient) {
        // Implement logic to set ingredient flags
    }

    @Override
    public String getDishDetail() {
        // Implement logic to return dish name
        return "Wheat Dish";
    }

    @Override
    public List<String> getIngredientsDetail() {
        // Implement logic to return ingredient list based on the recipe type
        if (isChinese) {
            return chineseWheatRecipe;
        } else if (isNorthIndian) {
            return northIndianWheatRecipe;
        } else if (isSouthIndian) {
            return southIndianWheatRecipe;
        } else {
            // Default to an empty list if no recipe type is selected
            return new ArrayList<>();
        }
    }
}
