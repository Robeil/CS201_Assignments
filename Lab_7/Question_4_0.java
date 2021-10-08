package CS201_Assignments.Lab_7;

import java.util.Scanner;

public class Question_4_0 {

    public Question_4_0() {

    }

    public void primeNumber(int number) {
        Scanner inputNumber = new Scanner(System.in);

        int i = 2;
        boolean isPrime = true;
        if (number > 0) {
            while (i <= number / 2) {

                if (number % i == 0) {
                    isPrime = false;
                    System.out.println(i + " ");
                    System.out.println(number + " ");
                    break;
                }
                i++;
            }
        } else {
            System.out.println("Goodbye, You entered a negative number.");
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
            System.out.println("Please try another number.");
            number = inputNumber.nextInt();
        }
    }

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please enter any number then I will let you know if is prime or not.");
        int number = inputNumber.nextInt();
        Question_4_0 primeCheck = new Question_4_0();
        primeCheck.primeNumber(number);
    }
}
