package CS201_Assignments.Lab_8_9;

import java.util.Scanner;

public class Question_2 {

    public static void countCapitalChar(String sentence) {

        int counter = 0;
        //looping the entire sentence
        for (int i = 0; i < sentence.length(); i++) {

                if (Character.isUpperCase(sentence.charAt(i))) {
                    counter++;
                }
        }
        System.out.println("There is " + counter + " Capital character");
    }

    public static void main(String[] args) {

        System.out.println("please enter any sentence");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        boolean isEmpty = sentence.isEmpty();

        while (!isEmpty) {
            countCapitalChar(sentence);
            System.out.println("Please enter any sentence.");
            sentence = input.nextLine();
            isEmpty = sentence.isEmpty();

        }
        System.out.println("Goodbye, you entered empty string.");
    }
}