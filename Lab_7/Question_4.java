package CS201_Assignments.Lab_7;

import java.util.Scanner;

public class Question_4 {
    public void primeNumber1(int number) {
        Scanner input = new Scanner(System.in);

        boolean isPrime = true;
        if (number > 0) {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        } else {
            System.out.println("Goodbye, you entered negative ");
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
            System.out.println("Try again negga");
            number = input.nextInt();
        }
    }

    public static void main(String[] args) {

        System.out.println("Please enter any number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Question_4 firstPrime = new Question_4();
        firstPrime.primeNumber1(number);
    }
}
