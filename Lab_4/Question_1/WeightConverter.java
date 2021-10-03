package CS201_Assignments.Lab_4.Question_1;


import java.text.MessageFormat;

public class WeightConverter {

    //created constant value
    private static final double MOONGRAVITY = 0.167;
    private double weightEarth;

    //Created parameterized free constructor
    public WeightConverter() {

    }

    public double getWeightEarth() {
        return weightEarth;
    }

    public void setWeightEarth(double weightEarth) {
        this.weightEarth = weightEarth;
    }

    public double convert(double yourWeight) {

        double yourWeightInMoon = yourWeight *= MOONGRAVITY;
        return yourWeightInMoon;
    }
}