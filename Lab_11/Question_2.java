package CS201_Assignments.Lab_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_2 {
    public static void exception_2(){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Please enter any number.");
            int num = scanner.nextInt();
            if(num != 0){
                throw new Exception("Not zero");
            }
            System.out.println("I am happy with the input");
        } catch(InputMismatchException e){
            System.out.println("Invalid Entry");
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally Clause Executed");
        }

    }
    public static void main(String[] args) {

        /**(a) -1  //FIXME ==> Error: Not zero and ==> Finally Clause Executed.
         * (b) 0  //FIXME ==>I am happy with the input ==> And Finally Clause Executed
         *(c) 12xy  //FIXME ==>Invalid Entry ==> Finally Clause Executed
         */

        exception_2();
    }
}
