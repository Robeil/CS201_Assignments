//package CS201_Assignments.Lab_7;
//
//import java.util.Scanner;
//
//public class Question_4_sample {
//
//    public static void main(String[] args) {
//
//        System.out.println("Please enter any number");
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//
//        boolean isPrime = false;
//
//        if (number > 0) {
//
//            for (int i = 2; i < number / 2; i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//                i++;
//            }
//        } else {
//            System.out.println("Goodbye, you entered negative ");
//        }
//
//        if (isPrime) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//            System.out.println("Try again Please.");
//            number = input.nextInt();
//
//        }
//
//    }
//}
