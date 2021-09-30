package CS201Course.CS201_Assignments.Lab_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_3_Question_2 {
    public static void main(String[] args) {

        System.out.println("Please enter the length in centimeter");
        Scanner userInput = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("0.00");
        double centimeterInput = userInput.nextDouble();
        //One inches is equals to 2.54 centimeters
        double inch = 2.54;
        //One foot is equals to 12 inches
        double foot = 12;
        if(centimeterInput > 0) {
            //Converting centimeters to inches
            double convertInch = centimeterInput / inch;
            //converting inches to foot
            double convertFeet = convertInch / foot;
            //????????? separate feet and inches /// Using example of coin change
            System.out.println(form.format(convertInch) + " inches");
            System.out.println(form.format(convertFeet) + " feet");
        } else{
            System.out.println("Wrong entry, centimeters can't be zero or negative.");
        }

    }
}
