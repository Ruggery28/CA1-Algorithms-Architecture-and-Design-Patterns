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
    public QueueStructure() {
        this.storage = new FoodItem[capacity];
        this.front = 0;
        this.count = 0;
        this.rear = -1;
    }

    //mehtod to check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    //method to check if the queue is full
    public boolean isFull() {
        return count == capacity;
    }

    //method to push a value inside the queue
    public void enqueue(FoodItem foodItem) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full!");
        }
        //if queue is not full we apply those conditions 
        rear = (rear + 1) % capacity; //move rear using module
        storage[rear] = foodItem; //store the item according to rear index
        count++; //add the size to count +1
    }

    //method to remove an intem inside the queue
    public void dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        //if queue is not empty we apply those conditions
        FoodItem tempItem = storage[front]; //save the previous value
        storage[front] = null; //clear the reference inside the front index
        front = (front + 1) % capacity; //move front using module
        count--; //decreasing count -1
        System.out.println("Item: " + tempItem + " has been deleted.");
    }

    //method to peak the first/old item
    public FoodItem peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        //if queue is not empty we return the old value
        return storage[front];
    }

    //method to display all items inside the array
    public void display() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        //if queue is not empty we apply those conditions
        for (int i = 0; i < count; i++) {
            //create a variable c to store temporary the front value to iterate through the index using module
            int c = (front + i) % capacity;; 
            System.out.println("Food Item: " + storage[c]);
        }
    }

}
