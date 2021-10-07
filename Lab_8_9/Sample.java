package CS201_Assignments.Lab_8_9;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence.");
        Scanner textInput = new Scanner(System.in);
        String s = textInput.nextLine();

        int count1 = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s != " ") {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'u' || s.charAt(i) == 'o' || s.charAt(i) == 'i') {
                    System.out.println(i);
                    count1++;
                }
            }
            System.out.println("You done for now.");
        }
    }
}
