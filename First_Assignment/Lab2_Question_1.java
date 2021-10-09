package CS201_Assignments.First_Assignment;

import java.util.Scanner;

public class Lab2_Question_1 {
    public static void main(String[] args) {

        //asking a user to type in their full name
        System.out.println("Please enter your first middle and last nam.");
        //Reading the user input
        Scanner userInput = new Scanner(System.in);
        //Storing the user input
        String firstName = userInput.next();
        String middleName = userInput.next();
        String lastName = userInput.next();
        //Concatenating the full name
        String fullName = firstName + " " + middleName.charAt(0) + "." + " "+  lastName;
        //Printing out full to name to console
        System.out.println(fullName);

    }
}
