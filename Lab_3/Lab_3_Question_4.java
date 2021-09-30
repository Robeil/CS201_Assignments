package CS201Course.CS201_Assignments.Lab_3;

import java.util.Scanner;

public class Lab_3_Question_4 {
    public static void main(String[] args) {

        System.out.println("Please enter your weight and I will tell you the calories you need");
        Scanner userInput = new Scanner(System.in);
        double weight = userInput.nextDouble();
        if(weight > 0){
            double calories = weight * 19;
            System.out.println("You need " + calories + " per day.");
        } else {
        System.out.println("Wrong entry, weight can't be negative");
}


    }
}
