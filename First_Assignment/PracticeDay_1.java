package CS201Course.CS201_Assignments.First_Assignment;

import java.util.Scanner;

public class PracticeDay_1 {
    public static void main(String[] args) {

        System.out.println("Please enter your first name and last name");
        Scanner input = new Scanner(System.in);
        String firstName = input.next();
        String lastName = input.next();
        String initial = firstName.charAt(0) + "" + lastName.charAt(0);
        System.out.println(initial);

    }

}
