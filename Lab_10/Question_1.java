package CS201_Assignments.Lab_10;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question_1 {

    public static void hotAndCold(double[] yearTemp) {

        //Loop that find the hottest temperature in the year
        double hottest = 0.0;
        for (int i = 0; i < yearTemp.length; i++) {
            if (yearTemp[i] > hottest) {
                hottest = yearTemp[i];
            }
        }
        //Loop that find the coldest temperature in the year
        double coldest = 0.0;
        for (int i = 0; i < yearTemp.length; i++) {
            if (yearTemp[i] < coldest) {
                coldest = yearTemp[i];
            }
        }
        System.out.println("The coldest temperature ❄️  " + coldest + "" + " and the hottest ☀️ ️" + hottest);

        //Loop that find the difference between the hottest and the coldest
        double difference = hottest - coldest;
        System.out.println("The difference between the hottest and the coldest is " + difference + ".");
    }

    public static void printMonthlyTemp(double[] yearTemp, int[] monthDay, int month, int day) {

        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        double[][] monthly = new double[monthDay.length][];
        int index = 0;
        int j = 0;
        double hottest = 0.0;
        double coldest = 0.0;

        //Getting the daily temp of the year
        for (int i = 0; i < monthly.length; i++) {

            System.out.println("\n" + monthName[i]);
            monthly[i] = new double[monthDay[i]];

            //Getting for every month
            for (j = 0; j < monthDay[i]; j++) {

                monthly[i][j] = yearTemp[index];
                //The hottest day in a month
                if (monthly[i][j] > hottest) {
                    hottest = monthly[i][j];
                }
                //The coldest day in a month
                if (monthly[i][j] < coldest) {
                    coldest = monthly[i][j];
                }
                index++;
            }
            double requestedTemp = 0.0;
            //picking requested month and date and giving the temperature
            for (int k = month; k < monthly.length; k++) {

                for (int d = day; d < monthDay[d]; d++) {
                    requestedTemp = monthDay[d];
                }
            }

            //Printing the output
            System.out.println("Requested month is => " + monthName[month - 1] + " and date => " + day + " and the temperature is => " + requestedTemp);
            System.out.println("This is the hottest for the month ☀️ " + monthName[i] + " " + hottest);
            System.out.println("This is the coldest for the month ❄️ " + monthName[i] + " " + coldest);
            System.out.println(Arrays.toString(monthly[i]));
        }
    }

    public static void hottestTempYear(double[] yearTemp) {
        double hottest = 0.0;
        for (int i = 0; i < yearTemp.length; i++) {
            if (yearTemp[i] > hottest) {
                hottest = yearTemp[i];
            }
        }
        System.out.println("This is the hottest ☀️  " + hottest + " for this year.");
    }

    public static void coldestTempYear(double[] yearTemp) {
        double coldest = 0.0;
        for (int i = 0; i < yearTemp.length; i++) {
            if (yearTemp[i] < coldest) {
                coldest = yearTemp[i];
            }
        }
        System.out.println("\nThis is the coldest ❄️ " + coldest + " for this year.");
    }

    public static void main(String[] args) {

        DecimalFormat deci = new DecimalFormat();
        Random random = new Random();
        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        double[] yearTemp = new double[365];
        //Storing the entire year from random
        for (int i = 0; i < yearTemp.length; i++) {
            yearTemp[i] = (double) (random.nextInt(126));
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the month.");
        int month = input.nextInt();
        System.out.println("Please enter the day.");
        int day = input.nextInt();

        if (month > 0 && month <= 12 && day > 0 && day <= 31) {
            //Colling all method
            printMonthlyTemp(yearTemp, monthDay, month, day);
            coldestTempYear(yearTemp);
            hottestTempYear(yearTemp);
            hotAndCold(yearTemp);
            //pickMonthAndDay(yearTemp, monthDay, month, day);
        } else {
            System.out.println("Wrong entry, try again");
        }
    }
}

