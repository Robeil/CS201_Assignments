package CS201_Assignments.Lab_10;

import java.util.Scanner;

public class Question_2 {

    public static double compute(int[] newArray) {
        /**
         * Write a program that computes the standard deviation of N real numbers.
         * The variable 􏰊x is the average of N input values x1 through xN.
         * The program first prompts the user for N and then declares an array of size N.
         */
        double sum = 0.0;
        double average = 0.0;
        double standardDev = 0.0;
        //Looping the new array and add
        for (int i = 0; i <= newArray.length; i++) {
            sum += i;
        }
        //Printing the average
        System.out.println(average = sum / newArray.length);
        for (int i = 0; i < newArray.length; i++) {
            standardDev += Math.pow(i - average, 2);
        }
        return Math.sqrt(standardDev / newArray.length);
    }

    public static void main(String[] args) {

        System.out.println("Please enter any real numbers.");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] newArray = new int[num];

        //Storing the new array from the user
        for (int i = 1; i <= num; i++) {
            newArray[i] = i++;
        }

        compute(newArray);
    }
}
