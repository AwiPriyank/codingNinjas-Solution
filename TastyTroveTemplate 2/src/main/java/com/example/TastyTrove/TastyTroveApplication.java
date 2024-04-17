package com.example.TastyTrove;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TastyTroveApplication {

    public static void main(String[] args) {
        // Fetch context from ApplicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Fetch User details from Console
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Fetch Recipe selection from User
        System.out.println("Select a recipe type (Chinese, North Indian, South Indian): ");
        String recipeType = scanner.nextLine();

        // Fetch Ingredient Selection
        System.out.println("Select an ingredient (Lentils, Rice, Wheat): ");
        String ingredientType = scanner.nextLine();

        // Get the required bean from context based on recipe and ingredient selection
        Recipe recipe = (Recipe) context.getBean(recipeType + ingredientType);

        // Set user's name
        recipe.setUserName(userName);

        // Display the recipe details
        recipe.getDetails();

        // Close the scanner
        scanner.close();
    }
}
