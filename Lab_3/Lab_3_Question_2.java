package CS201CourseFolder.CS201_Assignments.Lab_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_3_Question_2 {
    public static void main(String[] args) {

        System.out.println("Please enter the length in centimeter.");
        Scanner userInput = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("0.00");
        double centimeterInput = userInput.nextDouble();
        //One inches is equals to 2.54 centimeters
        final double INCH = 2.54;
        //One foot is equals to 12 inches
        final double FOOT = 12;
        if (centimeterInput > 0) {
            //Converting centimeters to inches
            double convertInch = centimeterInput / INCH;
            //converting inches to foot
            double convertFeet = convertInch / FOOT;
            System.out.print("Your height is " + form.format(convertInch) + " in inches and ");
            System.out.print(form.format(convertFeet) + " in feet.");
        } else {
            System.out.println("Wrong entry, centimeters can't be zero or negative.");
        }

    }
}
