package CS201_Assignments.Lab_6;

public class Question_3 {
    public static boolean main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

       // Question # A
        boolean isTrueA = x < 10 || x > 10;
        if (isTrueA) {
            return true;
        } else {
            return false;
        }
        // Question # B
        boolean isTrueB = x > y && y > x;
        if(isTrueB){
            return true;
        } else{
            return false;
        }
        // Question # C
        boolean isTrueC = (x < y + z) && (x + 10 <= 20);
        if(isTrueC){
            return true;
        } else{
            return false;
        }
        // Question # D
        boolean isTrueD = z - y == x && Math.abs(y - z) == x;
        if(isTrueD){
            return true;
        } else{
            return false;
        }
        // Question # E
        boolean isTrueE = x < 10 && x > 10;
        if(isTrueE){
            return true;
        } else{
            return false;
        }
        // Question # F
        boolean isTrueF = x > y || y > x;
        if(isTrueF){
            return true;
        } else{
            return false;
        }
        // Question # G
        boolean isTrueG = !(x < y + z) || !(x + 10 <= 20);
        if(isTrueG){
            return true;
        } else{
            return false;
        }
        // Question # H
        boolean isTrueH = !((x == y)) && (x != y) && (x < y || y < x);
        if(isTrueH){
            return true;
        } else{
            return false;
        }
    }
}
