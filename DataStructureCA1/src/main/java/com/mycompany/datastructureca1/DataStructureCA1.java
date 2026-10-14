/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.datastructureca1;

import com.mycompany.datastructureca1.queue.QueueStructure;
import com.mycompany.datastructureca1.model.FoodItem;
import com.mycompany.datastructureca1.stack.StackStructure;
import com.mycompany.datastructureca1.validation.Validation;
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
            System.out.print("Enter your option: ");

            //checking if the user is entering a number. if not print a invalid message and ask again.
            if (sc.hasNextInt()) {
                int modelOption = sc.nextInt();
                sc.nextLine(); //clean the buffer

                //if option is equal to 0 exit the program
                if (modelOption == 0) {
                    isValid = true;
                    System.out.println("Ending program....");
                    return;
                    //if option is equal to 1 or 2 enter the method switchMenu
                } else if (modelOption == 1 || modelOption == 2) {
                    //method that was created to execute the switch and cases
                    switchMenu(modelOption);
                } else {
                    System.out.println("Option not valid, enter again!");
                }

            } else {
                System.out.println("Enter a valid option! Try it again..");
                sc.nextLine(); //cleaning the buffer not to become an infinite loop
            }
        }
        sc.close();
    }

    //method to execute all the commands inside the Stack
    private static void switchMenu(int modelOption) {

        //instantianse the Model Structure classes
        StackStructure stack = new StackStructure();
        QueueStructure queue = new QueueStructure();

        boolean validator = true;
        while (validator) {
            getMenu();
            System.out.printf("Enter your option: ");
            String option = sc.nextLine();
            //Switch and case to execute the methods according with the user
            try {
                switch (option) {
                    case "1": {
                        //returning the value inside the method 
                        String foodName = Validation.validFood();
                        double weightGrams = Validation.validWeight();
                        //Instantianting the object foodItem 
                        FoodItem foodItem = new FoodItem(foodName, weightGrams, 14);
                        //Inserting the foodItem according to the model that has been chosen
                        if (modelOption == 1) {
                            stack.push(foodItem);
                        } else {
                            queue.enqueue(foodItem);
                        }
                        break;
                    }
                    case "2": {
                        //Deliting the foodItem according to the model that has been chosen(LIFO,FIFO)
                        if (modelOption == 1) {
                            stack.pop();
                        } else {
                            queue.dequeue();
                        }
                        break;
                    }
                    case "3": {
                        //Peeking the foodItem according to the model that has been chosen(LIFO,FIFO)
                        if (modelOption == 1) {
                            System.out.println(stack.peek());
                        } else {
                            System.out.println(queue.peek());
                        }
                        break;
                    }
                    case "4": {
                        //Deleting the foodItem according to the model that has been chosen(LIFO,FIFO)
                        if (modelOption == 1) {
                            stack.display();
                        } else {
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
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
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
