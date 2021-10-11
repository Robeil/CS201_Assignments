package CS201_Assignments.Lab_8_9;

import java.util.Scanner;

public class Question_1 {

    public static void checkVowels(String sentence) {

        //Declaring each vowels counters
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        //Using for loop here to check if the statement is empty or not
        for (int i = 0; i < sentence.length(); i++) {
            //checking the occurrence of the vowels
            if (sentence.charAt(i) == 'a') {
                countA++;
            } else if (sentence.charAt(i) == 'e') {
                countE++;
            } else if (sentence.charAt(i) == 'i') {
                countI++;
            } else if (sentence.charAt(i) == 'o') {
                countO++;
            } else if (sentence.charAt(i) == 'u') {
                countU++;
            }
        }

        System.out.println("# of 'a' : " + countA
                + "\n# of 'e' : " + countE
                + "\n# of 'i' : " + countI
                + "\n# of 'o' : " + countO
                + "\n# of 'u' : " + countU);
    }

    public static void main(String[] args) {

        Scanner textInput = new Scanner(System.in);
        String sentence = textInput.nextLine();

        //Boolean check if the string is empty or nat
        boolean isEmpty = sentence.isEmpty();
        // If the statement is not empty the while loop will execute
        while (!isEmpty) {
            checkVowels(sentence);
            System.out.println("Please enter any sentence.");
            sentence = textInput.nextLine();
            isEmpty = sentence.isEmpty();
        }
        System.out.println("Goodbye, you entered empty string.");

    }

}