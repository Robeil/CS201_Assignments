package CS201_Assignments.Lab_12;

public class Question_4 {

    public static void recursiveReverse(String word, int index) {

        if (index == word.length()) {
            return;
        } else {

            recursiveReverse(word, index + 1);
            System.out.print(word.charAt(index));
        }
    }

    public static void main(String[] args) {

        int index = 0;

        recursiveReverse("robeil", index);
    }

}
