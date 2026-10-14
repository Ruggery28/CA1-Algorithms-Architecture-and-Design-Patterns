/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructureca1.validation;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    //method to check if the user entered the right valid food option
    public static String validFood() {
        boolean validaton = true;
        String[] foodOption = {"Burger", "Pizza", "Fries", "Sandwich", "Hotdog"};
        String foodName = ""; //empty string that will be returned

        //while validation till the user enter one of the options.
        while (validaton) {
            System.out.println("Food Options: [Burger, Pizza, Fries, Sandwich, and Hotdog]");
            System.out.printf("Enter Food Name: ");
            foodName = sc.nextLine();

            //check first if the user enter a string
            if (foodName.matches("[a-zA-Z]+")) {
                //for loop to go inside the array and check one by one
                for (String option : foodOption) {
                    if (option.equalsIgnoreCase(foodName)) {
                        validaton = false;
                        break;
                    }
                }
                //if validation is still true it means the user has entered an invalid option
                if (validaton) {
                    System.out.println("Enter one of the valid food option!");
                }

            } else {
                System.out.println("Enter a valid String!");
            }

        }
        //return the valid food in upperCase
        return foodName.toUpperCase();
    }
//Method to validate the weight 
    public static double validWeight() {
        boolean validDouble = true;
        double weightGrams = 0.0;
        while (validDouble) {
            try {
                System.out.printf("Enter the weight in grams: ");
                String weight = sc.nextLine();
                weightGrams = Double.parseDouble(weight); //Converting the String to double
                if (weightGrams < 0.1) {
                    System.out.println("Enter a valid weight value!");
                } else {
                    validDouble = false;
                }
                //Validating value of weight in grams
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number! " + e.getMessage());
            }
        }
        return weightGrams;

    }

}
