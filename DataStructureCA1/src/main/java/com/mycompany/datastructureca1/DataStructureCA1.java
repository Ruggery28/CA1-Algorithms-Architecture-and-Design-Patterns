/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.datastructureca1;

import com.mycompany.datastructureca1.queue.QueueStructure;
import com.mycompany.datastructureca1.model.FoodItem;
import com.mycompany.datastructureca1.stack.StackStructure;
import java.util.InputMismatchException;
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
            //try {
            System.out.println("============ Data Structure Model ============");
            System.out.println("Choose [1]: Stack || [2]: Queue || [0]: Exit");
            int modelOption = sc.nextInt();
            sc.nextLine(); //clean the buffer

            if (modelOption == 0) {
                isValid = true;
                System.out.println("Ending program....");
                return;
            }

            if (modelOption == 1 || modelOption == 2) {
                //method that was created to execute the switch and cases
                switchMenu(modelOption);
            }

            System.out.println("Enter a valid option!!");
//            } catch (InputMismatchException e) {
//                System.out.println("Error: " + e.getMessage());
//            }
        }
        sc.close();
    }

    //method to execute all the commands inside the Stack
    private static void switchMenu(int modelOption) {

        //instantianse the Model Structure classes
        StackStructure stack = new StackStructure();
        QueueStructure queue = new QueueStructure();

        try {
            boolean validator = true;
            while (validator) {
                getMenu();
                System.out.printf("Enter your option: ");
                String option = sc.nextLine();
                //Switch and case to execute the methods according with the user
                switch (option) {
                    case "1": {
                        System.out.println("Food Options: [Burger, Pizza, Fries, Sandwich, and Hotdog]");
                        System.out.printf("Enter Food Name: ");
                        String foodName = sc.nextLine();
                        System.out.printf("Enter the weight in grams: ");
                        double weight = sc.nextDouble();
                        sc.nextLine();
                        //Instantianting the object foodItem 
                        FoodItem foodItem = new FoodItem(foodName, weight, 14);
                        //Inserting the foodItem according to the model that has been chosen
                        if (modelOption == 1) {
                            stack.push(foodItem);
                        }
                        if (modelOption == 2) {
                            queue.enqueue(foodItem);
                        }
                        break;
                    }
                    case "2": {
                        //Deliting the foodItem according to the model that has been chosen(LIFO,FIFO)
                        if (modelOption == 1) {
                            stack.pop();
                        }
                        if (modelOption == 2) {
                            queue.dequeue();
                        }
                        break;
                    }
                    case "3": {
                        //Peeking the foodItem according to the model that has been chosen(LIFO,FIFO)
                        if (modelOption == 1) {
                            System.out.println(stack.peek());
                        }
                        if (modelOption == 2) {
                            System.out.println(queue.peek());
                        }
                        break;
                    }
                    case "4": {
                        //Deleting the foodItem according to the model that has been chosen(LIFO,FIFO)
                        if (modelOption == 1) {
                            stack.display();
                        }
                        if (modelOption == 2) {
                            queue.display();
                        }
                        break;
                    }
                    case "5": {
                        validator = false;
                        break;
                    }
                    default: {
                        System.out.println("Enter a valid option!");
                    }
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //method to print all the options
    private static void getMenu() {
        System.out.println("========= Menu =========");
        System.out.println("[1] Add a new Food: ");
        System.out.println("[2] Pop/Remove a Food: ");
        System.out.println("[3] Peek the Food Item: ");
        System.out.println("[4] Display all Food: ");
        System.out.println("[5] Exit the program: ");
    }

}
