package com.pluralsight;

public class RollTheDice {

    public static void main(String[] args) {

//         Step 1: Create Dice object
        Dice dice = new Dice();

//         Step 2: Variables to store each roll
        int roll1;
        int roll2;

//         Step 3: Counters for sums
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

//         Step 4: Loop 100 times
        for (int i = 1; i <= 100; i++) {

//             Step 5: Roll the dice twice
            roll1 = dice.roll();
            roll2 = dice.roll();

//             Step 6: Calculate sum
            int sum = roll1 + roll2;

//             Step 7: Display results
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + "   Sum: " + sum);

//             Step 8: Check sum and update counters

            if (sum == 2) {
                twoCounter++; // increment counter
            }

            if (sum == 4) {
                fourCounter++;
            }

            if (sum == 6) {
                sixCounter++;
            }

            if (sum == 7) {
                sevenCounter++;
            }
        }

//         Step 9: Display final results
        System.out.println("\n=== Results ===");
        System.out.println("Times rolled a 2: " + twoCounter);
        System.out.println("Times rolled a 4: " + fourCounter);
        System.out.println("Times rolled a 6: " + sixCounter);
        System.out.println("Times rolled a 7: " + sevenCounter);
    }
}
