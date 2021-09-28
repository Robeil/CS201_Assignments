package CS201Course.CS201_Assignments.First_Assignment;

import java.util.Scanner;

public class Lab2_Question_2 {
    public static void main(String[] args) {

        //Asking and reading the user input
        System.out.println("Please type any sentence");
        Scanner userInput = new Scanner(System.in);
        //Storing the user input
        String textInput = userInput.nextLine();
        //Fetching the user length
        int textLength = textInput.length();
        //fetching the first character
        char firstChar = textInput.charAt(0);
        //fetching the last character
        char lastChar = textInput.charAt(textLength - 1);
        //Printing all to console
        System.out.println(textLength) ;
        System.out.println(firstChar);
        System.out.println(lastChar);


    }
}
