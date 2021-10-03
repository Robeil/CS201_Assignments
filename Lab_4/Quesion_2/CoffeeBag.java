package CS201_Assignments.Lab_4.Quesion_2;

import java.text.DecimalFormat;

public class CoffeeBag {


    private double bagWeight;
    private int numberOfBags;
    private static final double PRICEPERLB = 5.99;
    private static double TAXRATE = 0.0725;
    //Created extra variable to use for the output
    private static final double TAXRATEDISPLAY = 7.25;
    double totalPriceWithTaxOfCoffee = 0.0;
    double totalPriceOfCoffee = 0.0;

    //Created parameterized constructor
    public CoffeeBag(double bagWeight, int numberOfBags) {

        this.bagWeight = bagWeight;
        this.numberOfBags = numberOfBags;
    }

    public double getBagWeight() {
        return bagWeight;
    }

    public void setBagWeight(double bagWeight) {
        this.bagWeight = bagWeight;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
    public double totalPrice(){

        //calculating the total price
        return this.bagWeight * this.numberOfBags * this.PRICEPERLB;

    }
    public double totalPriceWithTax(){

        //Importing decimal format to format the out put
        DecimalFormat form = new DecimalFormat("0.00");
        return Double.parseDouble(form.format(totalPrice()  +  (totalPrice()  * TAXRATE)));

    }

    @Override
    public String toString(){

        //returning the details
        return "Number of bags sold: " + this.getNumberOfBags() + "\nWeight per bag: "
                +this.getBagWeight() + " lb " +" \nPrice per pound: $" +  PRICEPERLB + "\nSales tax: "
                + TAXRATEDISPLAY + "%\nTotal price: $" + this.totalPriceWithTax();
    }


    public static void main(String[] args) {

        //Created bag for sale object
        Assignment.Lab_4.CoffeeBag bagForSale = new Assignment.Lab_4.CoffeeBag(5,32);

        //Printing out to the console
        System.out.println(bagForSale.toString());

    }
}

