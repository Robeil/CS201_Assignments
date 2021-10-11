package CS201_Assignments.Lab_8_9;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {

        System.out.println("Enter dna");
        Scanner input = new Scanner(System.in);
        String dna = input.nextLine();
        String newDna = "";
        char modified = ' ';
        for (int i = 0; i < dna.length(); i++) {
            if(dna.charAt(i) == 'A'){
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
}
