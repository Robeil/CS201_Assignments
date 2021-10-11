package CS201_Assignments.Lab_8_9;

import java.util.Scanner;

public class Question_4 {

    public void isPalindrome(String word) {

        String reversed = "";
        int length = word.length();

        for (int i = length - 1; i >= 0; i--) {

            reversed += word.charAt(i);

        }

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("==> " + word + " is a Palindrome");
        } else {
            System.out.println("==> " + word + " is NOT a Palindrome");
        }
    }
    public static void main(String[] args) {

        System.out.println("Please enter any word.");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        boolean isEmpty = word.isEmpty();


        Question_4 checkOne = new Question_4();
        checkOne.isPalindrome(word);

    }
}
