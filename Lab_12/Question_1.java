package CS201_Assignments.Lab_12;

public class Question_1 {

    public static int recursiveLength(String word, int index) {

        if (index == word.length()) {
            return 0;
        } else {

        return 1 + recursiveLength(word, index + 1);

        }
    }

    public static void main(String[] args) {

        int index = 0;

        System.out.println(recursiveLength("Robeil", index));
    }
}
