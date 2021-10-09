package CS201_Assignments.First_Assignment;

import java.util.Scanner;

public class Lab2_Question_3 {

    public static void main(String[] args) {

        //Asking and reading the user input
        System.out.println("Please type any word");
        Scanner userInput = new Scanner(System.in);
        //String the user input
        String text = userInput.next();
        //Dividing the given word in to two
        int halfText = text.length() / 2;
        //fetching the character that located in the middle
        char halfChar = text.charAt(halfText);
        //Printing the middle character to the console
        System.out.println(halfChar);


    }
}
