package CS201_Assignments.Lab_7;

import java.util.Scanner;

public class Question_6 {

    public static void main(String[] args) {
        System.out.println("Please enter a number & I will tell you if it is perfect.");
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();
        int i = 1;
        int sum = 0;

        while(i <= number/2)
        {
            if(number % i == 0)
            {
                sum += i;
            }
            i++;
        }
        if(sum == number)
        {
            System.out.println(number +" is a perfect number");
        }
        else
            System.out.println(number +" is not a  perfect number");
    }



    }

