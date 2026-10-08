/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.datastructureca1;

import com.mycompany.datastructureca1.stack.FoodItem;
import com.mycompany.datastructureca1.stack.StackStructure;
import java.util.Scanner;

/**
 *
 * @author Ruggery
 */
public class DataStructureCA1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isValid = false;

        while (!isValid) {
            System.out.println("======== Data Structure Model ========");
            System.out.println("Choose [1]: Stack || [2]: Queue");
            int modelOption = sc.nextInt();
            sc.nextLine(); //clean the buffer

            //
            if (modelOption != 1 && modelOption != 2) {
                System.out.println("Enter a valid option!!");
                break;
            }

            if (modelOption == 1) {
                StackStructure stack = new StackStructure();
                boolean validator = true;
                while (validator) {
                    getMenu();
                    System.out.printf("Enter your option: ");
                    String option = sc.nextLine();

                    switch (option) {
                        case "1": {
                            System.out.println("Food Options: [Burger, Pizza, Fries, Sandwich, and Hotdog]");
                            System.out.printf("Enter Food Name: ");
                            String foodName = sc.nextLine();
                            System.out.printf("Enter the weight in grams: ");
                            double weight = sc.nextDouble();
                            sc.nextLine();
                            FoodItem foodItem = new FoodItem(foodName, weight, 14);
                            stack.push(foodItem);
                            break;
                        }
                        case "2": {
                            stack.pop();
                            break;
                        }
                        case "3": {
                            stack.peek();
                        }
                        case "4": {
                            stack.display();
                            break;
                        }
                        case "5": {
                            validator = false;
                        }
                        default: {
                            System.out.println("Enter a valid option!");
                        }
                    }
                }
            }

        }

    }

    private static void getMenu() {
        System.out.println("========= Menu =========");
        System.out.println("[1] Add a new Food: ");
        System.out.println("[2] Pop/Remove a Food: ");
        System.out.println("[3] Peek the Food Item: ");
        System.out.println("[4] Display all Food: ");
        System.out.println("[5] Exit the program: ");
    }

}
