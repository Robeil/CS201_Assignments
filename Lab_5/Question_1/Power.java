package CS201_Assignments.Lab_5.Question_1;

import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        //Asking the user to enter the number of power they want
        System.out.println("Please enter the number zero and I will tell how big is.");
        Scanner num = new Scanner(System.in);
        int givenNum = num.nextInt();

        //Casting to long to store big number and generate the number
        long power = (long) Math.pow(10, givenNum);

        //Using switch to match the given to the names
        switch (givenNum) {
            case 6:
                System.out.println("You entered a number with " + power + "zeros & it is Million.");
                break;
            case 9:
                System.out.println("You entered a number with " + power + "zeros &  it is Billion.");
                break;
            case 12:
                System.out.println("You entered a number with " + power + "zeros & it is Trillion.");
                break;
            case 15:
                System.out.println("You entered a number with " + power + "zeros & it is Quadrillion.");
                break;
            case 18:
                System.out.println("You entered a number with " + power + "zeros & it is Quintillion.");
                break;
            case 21:
                System.out.println("You entered a number with " + power + "zeros & it is Sextillion.");
                break;
            case 30:
                System.out.println("You entered a number with " + power + "zeros & it is Nonillion.");
                break;
            case 100:
                System.out.println("You entered a number with " + power + "zeros & it is Googol.");
                break;
            default:
                System.out.println("You enter weather below 6 or above 100 Sorry I can't handle it");
                break;


        }

    }

}
