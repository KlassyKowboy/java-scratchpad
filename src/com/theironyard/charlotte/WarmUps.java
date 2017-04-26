package com.theironyard.charlotte;

public class WarmUps {

    public boolean sleepIn (boolean weekday, boolean vacation) {
        // if it is NOT a weekday OR if it IS a vacation day, sleepIn (is true)
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // two monkeys (represented by aSmile & bSmile)
        // if they are both smiling we are in trouble (return true), if neither are smiling also return true

        return aSmile == bSmile;
    }

    public int sumDouble(int a, int b) {
        // Given two int values, return their sum. Unless the two values are the same, then return double their sum.
        int sum;

        if (a != b) {
            sum = a + b;
        } else {
            sum = (a + b) * 2;
        }
        return sum;
    }

}
