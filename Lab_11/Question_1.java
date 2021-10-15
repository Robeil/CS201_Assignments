package CS201_Assignments.Lab_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_1 {

    public static void assertion_1() {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter any number.");
            int num = scanner.nextInt();
            if (num != 0) {
                throw new Exception("Not zero");
            }
            System.out.println("I am happy with the input.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Entry");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        /**(a) -1  //FIXME ==> Error: Not zero.
         * (b) 0  //FIXME ==> I am happy with the Input.
         *(c) 12xy  //FIXME ==> Invalid Entry.
         */

        assertion_1();
    }
}
