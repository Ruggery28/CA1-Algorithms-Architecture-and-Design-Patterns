/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructureca1.queue;

import java.time.LocalDateTime;


/**
 *
 * @author Ruggery
 */
public class FoodItem {
    
    private String foodName;
    private double weight;
    private LocalDateTime bestBeforeDate;
    private LocalDateTime timeAdded; 

    //constructor to add the values inside the object
    public FoodItem(String foodName, double weight, int dayExpire) {
        this.foodName = foodName;
        this.weight = weight;
        //timeAdded will automatically add using the method LocalDataTime
        this.timeAdded = LocalDateTime.now();
        //bestBefore will calculate the time added + dayExpire
        this.bestBeforeDate = timeAdded.plusDays(dayExpire);
    }

    //getters in case need to get a value individually
    public String getFoodName() {
        return foodName;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDateTime getBestBeforeDate() {
        return bestBeforeDate;
    }

    public LocalDateTime getTimeAdded() {
        return timeAdded;
    }
    
    //method to print the array in a better way to visualise all the items.
    @Override
    public String toString(){
        return foodName + ": (" + weight + "g) | Added: " + timeAdded.toLocalDate()+ " | Best Before: " + bestBeforeDate.toLocalDate();
    }
    
    
    
}
