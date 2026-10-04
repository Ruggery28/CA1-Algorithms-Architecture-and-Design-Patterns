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
    
    private FoodItem[] stack;
    private int top;
    private final int capacity = 8;
    
    public StackStructure() {
        stack = new FoodItem[capacity];
        top = -1;
        
    }
    
    public void push(FoodItem item) {
        
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot add more food items.");
            return;
        }
        
    top++;
    stack[top] = item;
    
        System.out.println(item.getFoodName() + " added to the stack.");
    }
    
    
}
