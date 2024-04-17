package com.example.TastyTrove;

import java.util.List;

public class SouthIndian implements Recipe {
    private String name;
    private String userName;
    private Ingredients ingredients;

    // Setter method for setting the username
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Method to print recipe details
    @Override
    public void getDetails() {
        System.out.println("Hello user " + userName + ", we suggest you to make South Indian Dosa. " +
                "You can use the following ingredients:");
        List<String> ingredientList = ingredients.getIngredientsDetail();
        for (int i = 0; i < ingredientList.size(); i++) {
            System.out.println((i + 1) + ". " + ingredientList.get(i));
        }
    }

    // Setter method for injecting ingredients dependency
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }
}
