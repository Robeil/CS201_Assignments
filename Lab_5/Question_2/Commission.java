package CS201_Assignments.Lab_5.Question_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {

        //Declaring the constant variables
        final double perHour = 7.25;
        final int regularHours = 40;
        final double overTime = perHour + (perHour * 0.5);

        //Asking, fetching and formatting the user Input
        DecimalFormat form = new DecimalFormat("0.00");
        System.out.println("How many hours did your work today?");
        Scanner worked = new Scanner(System.in);
        double workedHours = worked.nextDouble();
        System.out.println("What is the total sale for today?");
        double totalSale = worked.nextDouble();

        //using if the user over time and calculating based his sale report and hours
        if (workedHours > 40) {
            if (totalSale >= 1.00 && totalSale <= 99.99) {

                double overTimeHours = workedHours - regularHours;
                System.out.println("You over time hour is: " + overTimeHours);
                double regularWage = workedHours * perHour;
                System.out.println("Your Regular wage is: " + regularWage);
                double overTimeWage = overTimeHours * overTime;
                System.out.println("Your overtime salary is:  " + overTimeWage);
                double commission = totalSale * 0.05;
                System.out.println("Your Commission: " + commission);
                double totalWage = regularWage + overTimeWage + commission;
                System.out.println("Your total salary is: " + form.format(totalWage));

            } else if (totalSale >= 100.00 && totalSale <= 299.99) {
                double overTimeHours = workedHours - regularHours;
                System.out.println("You over time hour is: " + overTimeHours);
                double regularWage = workedHours * perHour;
                System.out.println("Your Regular wage is: " + regularWage);
                double overTimeWage = overTimeHours * overTime;
                System.out.println("Your overtime salary is:  " + overTimeWage);
                double commission = totalSale * 0.10;
                System.out.println("Your Commission: " + commission);
                double totalWage = regularWage + overTimeWage + commission;
                System.out.println("Your total salary is: " + form.format(totalWage));

            } else if (totalSale >= 300.00) {

                double overTimeHours = workedHours - regularHours;
                System.out.println("You over time hour is: " + overTimeHours);
                double regularWage = workedHours * perHour;
                System.out.println("Your Regular wage is: " + regularWage);
                double overTimeWage = overTimeHours * overTime;
                System.out.println("Your overtime salary is:  " + overTimeWage);
                double commission = totalSale * 0.15;
                System.out.println("Your Commission: " + commission);
                double totalWage = regularWage + overTimeWage + commission;
                System.out.println("Your total salary is: " + form.format(totalWage));

            }
        } else {
            if (totalSale >= 1.00 && totalSale <= 99.99) {
                double regularWage = workedHours * perHour;
                System.out.println("Your Regular wage is: " + regularWage);
                double commission = totalSale * 0.05;
                System.out.println("Your Commission: " + commission);
                double totalWage = regularWage + commission;
                System.out.println("Your total salary is: " + form.format(totalWage));

            } else if (totalSale >= 100.00 && totalSale <= 299.99) {

                double regularWage = workedHours * perHour;
                System.out.println("Your Regular wage is: " + regularWage);
                double commission = totalSale * 0.10;
                System.out.println("Your Commission: " + commission);
                double totalWage = regularWage + commission;
                System.out.println("Your total salary is: " + form.format(totalWage));

            } else if (totalSale >= 300.00) {

                double regularWage = workedHours * perHour;
                System.out.println("Your Regular wage is: " + regularWage);
                double commission = totalSale * 0.15;
                System.out.println("Your Commission: " + commission);
                double totalWage = regularWage + commission;
                System.out.println("Your total salary is: " + form.format(totalWage));

            }
        }

    }
}
