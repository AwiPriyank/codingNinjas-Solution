package com.example.TastyTrove;

/**
 
  This class is an implementation of a Recipe Interface based on the selection 
  done in the console for Recipe type.You need to complete this class 
  based on the following tasks.
   
    Tasks:
  a. Override the methods of Recipe Interface.
  b. Add common attributes:
      1. String name
      2. String userName
      3. Ingredients ingredients
  c. Build the logic for all the methods based on the description mentioned in the Recipe Interface.
  d. Create a setter injection mentioned named as "setIngredients(Ingredients ingredients)" this method 
     injects the "ingredient" attribute as  a dependency into this class using Setter Injection approach.
     
**/

public class Chinese implements Recipe {
  

    private String name;
    private String userName;
    private Ingredients ingredients;

    // Setter method for setting the name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for setting the username
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Setter method for injecting Ingredients dependency
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    // Method to print recipe details
    @Override
    public void getDetails() {
        System.out.println("Hello user " + userName + ", we suggest you to make Chinese Fried Rice. " +
                "You can use the following ingredients:");
        System.out.println("1. Steamed Rice");
        System.out.println("2. Ginger");
        System.out.println("3. Garlic");
        System.out.println("4. Soy Sauce");
        System.out.println("5. Vinegar");
    }
}

