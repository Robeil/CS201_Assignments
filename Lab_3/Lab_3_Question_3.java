package CS201_Assignments.Lab_3;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Lab_3_Question_3 {
    public static void main(String[] args) {

        //Asking to enter the temperature and read it
        System.out.println("Please enter the temperature in degree Celsius.");
        Scanner tempInput = new Scanner(System.in);

        //Formatting the decimal appearance
        SimpleDateFormat form = new SimpleDateFormat("0.00");

        //Storing the degree celsius
        double temp = tempInput.nextDouble();

        //Converting to fahrenheit
        double fahrenheit = 1.8 * temp + 32;

        //Printing out the converted temperature to the console
        System.out.println(fahrenheit + " Degree Fahrenheit.");
    }
}