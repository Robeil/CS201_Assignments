package CS201_Assignments.Lab_7;

public class Question_3 {


    public void printTable() {

        //initialize num to added to every incremented column and row
        int num = 10;
        //loop for looping 4 times in a raw
        for (int raw = 0; raw < 4; raw++) {

            //loop for looping 10 times in a column
            for (int column = 0; column < 10; column++) {
                //printing num plus the column
                System.out.print(num + " ");
                num++;
            }
            //giving every number space in between
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        //creating newTable object
        Question_3 newTable = new Question_3();
        //calling the new object table with print table method
        newTable.printTable();

    }
}
