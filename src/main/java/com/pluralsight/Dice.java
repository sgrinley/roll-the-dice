package com.pluralsight;

public class Dice {

//  Use method to simulate rolling one die
    public int roll() {

//  Step 1: Define minimum and maximum values
        int minValue = 1;
        int maxValue = 6;

//  Step 2: Generate random number between 1 and 6
        int randomNumber = (int) (Math.random() * maxValue) + minValue;

//  Step 3: Return the result
        return randomNumber;
    }
}