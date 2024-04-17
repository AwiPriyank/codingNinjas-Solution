package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.List;

public class Rice implements Ingredients {
  private boolean isChinese = false;
  private boolean isNorthIndian = false;
    private boolean isSouthIndian = false;

  // Ingredient lists for different recipe types
  private List<String> chineseRiceRecipes = new ArrayList<>();
  private List<String> northIndianRiceRecipes = new ArrayList<>();
  private List<String> southIndianRiceRecipes = new ArrayList<>();

  // Constructor to initialize ingredient lists based on recipe type
  public Rice() {
    // Add ingredients for Chinese rice recipe
    chineseRiceRecipes.add("Rice");
    chineseRiceRecipes.add("Soy Sauce");
    chineseRiceRecipes.add("Ginger");
    chineseRiceRecipes.add("Garlic");
    chineseRiceRecipes.add("Vegetables");

    // Add ingredients for North Indian rice recipe
    northIndianRiceRecipes.add("Rice");
    northIndianRiceRecipes.add("Ghee");
    northIndianRiceRecipes.add("Cumin Seeds");
    northIndianRiceRecipes.add("Cardamom");
    northIndianRiceRecipes.add("Cashews");

    // Add ingredients for South Indian rice recipe
    southIndianRiceRecipes.add("Rice");
    southIndianRiceRecipes.add("Curry Leaves");
    southIndianRiceRecipes.add("Mustard Seeds");
    southIndianRiceRecipes.add("Urad Dal");
    southIndianRiceRecipes.add("Coconut");
  }

  @Override
  public void setIngredient(String ingredient) {
    // Implement logic to set ingredient flags based on the recipe type
  }

  @Override
  public String getDishDetail() {
    // Implement logic to return dish name based on the recipe type
    return "Rice Dish";
  }

  @Override
  public List<String> getIngredientsDetail() {
      // Implement logic to return ingredient list based on the recipe type
      if (isChinese) {
          return chineseRiceRecipes;
      } else if (isNorthIndian) {
          return northIndianRiceRecipes;
      } else if (isSouthIndian) {
          return southIndianRiceRecipes;
      } else {
          // Default to an empty list if no recipe type is selected
          return new ArrayList<>();
      }
  }
  
  
}
