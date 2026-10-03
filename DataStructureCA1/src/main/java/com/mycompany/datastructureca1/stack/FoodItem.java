/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructureca1.stack;

 import java.time.LocalDateTime;
/**
 *
 * @author Gabriel
 */
public class FoodItem {
    
    private String foodName;
    private double weight;
    //timeAdded will automatically add using the method LocalDateTime
    private LocalDateTime bestBeforeDate;
    //Best before to calculate the day it's going to expire
    private LocalDateTime timeAdded; 
    
    
    //Inserting getters to get a value indivudually    

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

    @Override
    public String toString() {
        return foodName + ": (" + weight + "g) | Added: " + timeAdded.toLocalDate()+ " | Best Before: " + bestBeforeDate.toLocalDate();
    }
    
   
    
}
