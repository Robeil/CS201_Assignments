package CS201_Assignments.Lab_6;

public class Question_3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

       // Question # A
        boolean isTrueA = x < 10 || x > 10;

        // Question # B
        boolean isTrueB = x > y && y > x;

        // Question # C
        boolean isTrueC = (x < y + z) && (x + 10 <= 20);

        // Question # D
        boolean isTrueD = z - y == x && Math.abs(y - z) == x;

        // Question # E
        boolean isTrueE = x < 10 && x > 10;

        // Question # F
        boolean isTrueF = x > y || y > x;

        // Question # G
        boolean isTrueG = !(x < y + z) || !(x + 10 <= 20);

        // Question # H
        boolean isTrueH = !((x == y)) && (x != y) && (x < y || y < x);

    }
}
