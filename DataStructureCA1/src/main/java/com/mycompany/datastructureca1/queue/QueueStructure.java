/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructureca1.queue;

/**
 *
 * @author Ruggery
 */
public class QueueStructure {
    
    //creating the variables that will be needed for the queue
    private FoodItem[] storage; 
    private int front;
    private int rear;
    private int count;
    private final int capacity = 8;
    
    //constructor to set the size of the array
    public QueueStructure(){
        this.storage = new FoodItem[capacity];
        this.front = 0;
        this.count = 0;
        this.rear= -1;
    }
    
    //mehtod to check if the queue is empty
    public boolean isEmpty(){
        return count == 0;
    }
    
    //method to check if the queue is full
    public boolean isFull(){
        return count == capacity;
    }
    
    
    
    
    
}
