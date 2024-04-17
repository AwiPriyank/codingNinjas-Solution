package com.example.TastyTrove;

public class NorthIndian implements Recipe {
    private String name;
    private String userName;
    private Ingredients ingredients;

    // Setter injection method
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    // Setter method for setting the username
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Method to print recipe details
    @Override
    public void getDetails() {
        String dishName = ingredients.getDishDetail();
        System.out.println("Hello user " + userName + ", we suggest you to make " + dishName + ". " +
                "You can use the following ingredients:");
        for (String ingredient : ingredients.getIngredientsDetail()) {
            System.out.println("- " + ingredient);
        }
    }
}
