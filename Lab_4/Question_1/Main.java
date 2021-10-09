package CS201_Assignments.Lab_4.Question_1;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        //Import decimal format to edit the output decimal
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //created moon weight object
        WeightConverter moonWeight = new WeightConverter();

        //calling the  weight converter to convert the given weight
        double yourWeight = moonWeight.convert(196);

        //Printing the result to console
        System.out.println("This is your weight in moon " + decimalFormat.format(yourWeight));


    }
}
