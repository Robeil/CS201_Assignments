package CS201_Assignments.Lab_12;

public class Question_2 {

    public static int minArray(int[] array, int index) {

        int min = array[index]; // int min = 0;
        int nextNum;

        if (index == array.length - 1) {
            return array[index];
        } else {

            nextNum = minArray(array, index + 1);

            if(array[index] < nextNum) {

                nextNum = array[index];
                return nextNum;
            } else {
                return nextNum;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 6, 9, 2, 7, 8, 3, 1, 2, 4, 7, 5, 1, 9};
        int index = 0;

        System.out.println(minArray(array, index));
    }
}
