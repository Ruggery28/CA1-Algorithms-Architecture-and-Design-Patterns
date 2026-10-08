/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructureca1.stack;

/**
 *
 * @author Gabriel
 */
public class StackStructure {

    private FoodItem[] stack;       //Array to store food items
    private int top;                //Keeps track for the top position
    private final int capacity = 8; //Maximum capacity allowed of items

    public StackStructure() {
        stack = new FoodItem[capacity];
        top = -1;
        //Creating empty stack
        //The top is set as -1, because the stack contains no items.

    }

    public void push(FoodItem item) {

        if (isFull()) {
            throw new IllegalStateException("Stack is full. Cannot add more food items.");
            // Adds food item to the top of the stack
            //In case the stack reaches the maximum capacity, the item can't be added.
        }

        top++;
        stack[top] = item;
        //This function adds a food item to the top of the Stack.
        System.out.println(item.getFoodName() + " added to the stack.");
    }

    public FoodItem pop() {
        // This function deletes the last value added if the stack is empty, no item is removed.
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        FoodItem removedItem = stack[top];
        stack[top] = null;
        top--;

        System.out.println(removedItem.getFoodName() + " was removed from the stack.");

        return removedItem;
    }

    public FoodItem peek() {
// This function show the last value inserted
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }

        return stack[top];
    }

    public void display() {

        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");

        }
        System.out.println("\nFood items in the stack.");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

    }

    public boolean isEmpty() {
        return top == -1;
        //Checks if the stack contains no food items.
    }

    public boolean isFull() {
        return top == capacity - 1;
        //Checks if the stack it's full.
    }

}
