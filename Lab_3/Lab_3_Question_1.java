package CS201Course.CS201_Assignments.Lab_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_3_Question_1 {
    public static void main(String[] args) {

        System.out.println("Please enter the value of A , B and C");
        Scanner inputValue = new Scanner(System.in);
        int a = inputValue.nextInt();
        int b = inputValue.nextInt();
        int c = inputValue.nextInt();
        //A
        int squareRootA = (int) Math.sqrt(Math.pow(b, 2)) + 4 * a * c;
        System.out.println("This is the square root of A : " + squareRootA);
        //B
        System.out.println("Please enter the value of X and Y");
        int x = inputValue.nextInt();
        int y = inputValue.nextInt();
        int squareRootB = x + 4 * ((int)Math.sqrt(y * y * y));
        System.out.println("This is the square root of B : " +squareRootB);
        //C
        int product = x * y;
        int squareRootC = product * product * product;
        System.out.println("This is the square root of C : " + squareRootC);
        //D
        DecimalFormat deci = new DecimalFormat("0.000");
        System.out.println("Please enter the value of R");
        int r = inputValue.nextInt();
        double area = Math.PI * (r * r);
        System.out.println("The area of the circle : " + deci.format(area));

    }
}
