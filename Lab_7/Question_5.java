package CS201_Assignments.Lab_7;

import java.util.Scanner;

public class  Question_5 {

    public void primeCheck(int inputNumber) {

        int counter = 1;
        for (int i = 2; i < inputNumber / 2; i += 2) {
            if (inputNumber % 2 == 0) {
                counter ++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nTotal prime numbers is: " + counter);
    }

    public static void main(String[] args) {

        System.out.println("Please enter any number.");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();

        Question_5 nPrime = new Question_5();
        nPrime.primeCheck(inputNumber);

    }
}
