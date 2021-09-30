package CS201Course.CS201_Assignments.Lab_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab_3_Question_5 {
    public static void main(String[] args) {
        System.out.println("Please enter the year you were born.");
        Scanner yearInput = new Scanner(System.in);
        Date thisYear = new Date();
        SimpleDateFormat currentYear= new SimpleDateFormat("yyyy");
        int year = yearInput.nextInt();
        int currentAge = Integer.parseInt(currentYear.format(thisYear)) - year;

        System.out.println("You are " + currentAge + " years old.");

    }


}
