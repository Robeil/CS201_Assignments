package CS201_Assignments.Lab_7;

import java.util.Scanner;

public class PerfectNumberForLoop {
    public static void main(String[] args) {
        System.out.println("Please enter any number .");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number % 2 == 0){
                sum += i;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println(sum);

        if(sum == number){
            System.out.println("It is perfect number");
        } else{
            System.out.println("It is not a perfect number");
        }
    }
}
