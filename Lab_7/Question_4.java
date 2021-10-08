package CS201_Assignments.Lab_7;

import java.util.Scanner;

public class Question_4 {

    public static boolean isPrimeNumber(int number) {

        boolean isPrime = true;

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        System.out.println("Please enter any number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (number > 0) {

            if (isPrimeNumber(number) == true) {

                System.out.println(number + " is a prime number.");
                System.out.println("Enter a number.");
                number = input.nextInt();
                isPrimeNumber(number);
            } else {

                System.out.println(number + " is not a prime number.");
                System.out.println("Try again Please.");
                number = input.nextInt();
                isPrimeNumber(number);
            }
        }
        System.out.println("Goodbye, You entered a negative number.");

    }
}