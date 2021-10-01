package CS201CourseFolder.CS201_Assignments.Lab_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_3_Question_1 {
    public static void main(String[] args) {

        //Asking the user to give the value and read from the user
        System.out.println("Please enter the value of A , B and C");
        Scanner inputValue = new Scanner(System.in);

        //Storing the given value
        int a = inputValue.nextInt();
        int b = inputValue.nextInt();
        int c = inputValue.nextInt();

        //getting the square root of the given data
        int squareRootA = (int) Math.sqrt(Math.pow(b, 2)) + 4 * a * c;
        System.out.println("This is the square root of A : " + squareRootA);

        //getting the square root of the given data
        System.out.println("Please enter the value of X and Y");
        int x = inputValue.nextInt();
        int y = inputValue.nextInt();
        int squareRootB = x + 4 * ((int) Math.sqrt(y));
        System.out.println("This is the square root of B : " + squareRootB);

        //multiplying x by y and get the product in triple
        int product = x * y;
        int squareRootC = (int) Math.cbrt(x * y);
        System.out.println("This is the square root of C : " + squareRootC);

        //Calculating the area of the circle
        DecimalFormat decimal = new DecimalFormat("0.000");
        System.out.println("Please enter the value of R");
        int r = inputValue.nextInt();
        double area = Math.PI * (r * r);
        System.out.println("The area of the circle : " + decimal.format(area));

    }
}
