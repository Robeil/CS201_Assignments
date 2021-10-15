package CS201_Assignments.Lab_12;

import java.util.Scanner;

public class Question_1 {

    public static void recursive(String word, int index) {

        if (index == word.length()){
            return;
        } else{
            System.out.println(word.charAt(index));
            recursive(word, index + 1);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int index = 0;

        recursive(word, index);
    }
}
