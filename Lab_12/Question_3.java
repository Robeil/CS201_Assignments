package CS201_Assignments.Lab_12;

public class Question_3 {

    public static int recursiveSum(int[] numbers, int index) {
        int sum = 0;
        int nextNum = 0;
        if (index == numbers.length -1) {
            return numbers[index];
        } else {
           return numbers[index] + recursiveSum(numbers, index + 1);

        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 0;

        System.out.println(recursiveSum(numbers, index));
    }
}