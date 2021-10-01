package CS201CourseFolder.CS201_Assignments.Lab_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab_3_Question_5 {
    public static void main(String[] args) {

        //Asking the user year of born nad read the given year
        System.out.println("Please enter the year you were born.");
        Scanner yearInput = new Scanner(System.in);

        //Creating the date method to get the current year
        Date thisYear = new Date();

        //Creating the date formatter method to fetch the year only
        SimpleDateFormat currentYear = new SimpleDateFormat("yyyy");

        //Storing the user given year
        int yearBorn = yearInput.nextInt();

        //Calculating the current year and the given year to know the age of the user
        int currentAge = Integer.parseInt(currentYear.format(thisYear)) - yearBorn;

        //Printing out the user age to console
        System.out.println("You were born " + yearBorn + " and you will be " + currentAge + " this years.");

    }


}
