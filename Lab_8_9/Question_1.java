package CS201_Assignments.Lab_8_9;

import java.util.Scanner;

public class Question_1 {

    public void findVowels(String sentence) {
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
        // for(int i = 0; i < sentence.length(); i++){
        //char index = sentence.charAt(i);
        while (sentence != " ") {
            if (sentence.contains("a")) {
                countA++;
                System.out.println("# of 'a' : " + countA);
            } else if (sentence.contains("e")) {
                countE++;
                System.out.println("# of 'e' : " + countE);
            } else if (sentence.contains("i")) {
                countI++;
                System.out.println("# of 'i' : " + countI);
            } else if (sentence.contains("o")) {
                countO++;
                System.out.println("# of 'o' : " + countO);
            } else if (sentence.contains("u")) {
                countU++;
                System.out.println("# of 'u' : " + countU);
            }
        }
    }
    //}

    public static void main(String[] args) {

        System.out.println("Please enter a sentence.");
        Scanner textInput = new Scanner(System.in);
        String sentence = textInput.nextLine();

        Question_1 vowels = new Question_1();
        vowels.findVowels(sentence);
    }

}
