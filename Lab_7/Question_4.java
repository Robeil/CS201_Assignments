package CS201_Assignments.Lab_7;

import java.util.Scanner;

public class Question_4 {

    public Question_4() {

    }

    public void primeNumber(int number) {
        Scanner inputNumber = new Scanner(System.in);
        int i = 2;
        boolean isPrime = false;

        while (number > 0) {
            if (number % i == 0) {
                isPrime = true;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
            System.out.println("Please try again.");
            number = inputNumber.nextInt();
        }
    }

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please enter any number then I will let you know if is prime or not.");
        int number = inputNumber.nextInt();
        Question_4 primeCheck = new Question_4();
        primeCheck.primeNumber(number);
    }
}
