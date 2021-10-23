package CS201_Assignments.Lab_8_9;

import java.util.Scanner;

public class Question_3 {


    public void DNA(String dna) {

        String newDna = "";
        char modified = ' ';
        dna.toUpperCase();

        for(int i = 0; i < dna.length(); i++){

            if (dna.charAt(i) == 'A'){
                modified = 'T';
            } else if(dna.charAt(i) == 'T'){
                modified = 'A';
            } else if(dna.charAt(i) == 'G'){
                modified = 'C';
            } else if(dna.charAt(i) == 'C'){
                modified = 'G';
            }
            newDna += modified;
        }
        System.out.println(newDna);

    }

    public static void main(String[] args) {
        Question_3 firstDna = new Question_3();
        System.out.println("Enter your DNA.");
        Scanner input = new Scanner(System.in);
        String dna = input.nextLine();

        boolean isEmpty = dna.isEmpty();
        // If the statement is not empty the while loop will execute
        while (!isEmpty) {

            firstDna.DNA(dna);
            System.out.println("Please try another.");
            dna = input.nextLine();
            isEmpty = dna.isEmpty();
        }
        System.out.println("Goodbye, you entered nothing.");

    }
}
