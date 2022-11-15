package com.company;

public class Main {
 //heeeheee heehha
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 2, 5, 8, 3, 2, 5, 6};
        int minimum = numbers[0]; //hold the minimum number
        int tempI = 0; //hold a temporary int number
        int indexJ = 0; //create a variable to hold the index of j

        //loops through the array numbers
        for (int i = 0; i < numbers.length; i++) {
            //stores the current number in the temporary int variable
            tempI = numbers[i];
            //loops through the rest of the array to compare each other number to the currentNumber to get the minimum
            for (int j = i + 1; j < numbers.length; j++) {
                //if the other number is less than the current number switch them in the array
                if (numbers[j] < minimum) {
                    minimum = numbers[j];
                    indexJ = j;
                }
            }
            numbers[i] = minimum;
            numbers[indexJ] = tempI;
        }
        for (element:int numbers){

        }
    }
}
