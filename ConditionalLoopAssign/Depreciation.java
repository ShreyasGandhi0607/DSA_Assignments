package ConditionalLoopAssign;

import java.util.Scanner;
import java.lang.Math;
public class Depreciation {
    public static void main(String[] args) {
        //Final Value = Initial Value - ((100-r)/100);
        //r -> depreciation rate
        //n -> number of years
        //Q : a new car originally costs 20,000$  .
        // The car's value has annual depreciation rate of 10%.Find Value of car after 6 years.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the original cost of car($)");
        double initialCost = in.nextDouble();
        System.out.println("Enter the number of years after which u want to check the  value of car");
        int years = in.nextInt();
        int r = 10;
        // The rate of depreciation is 10%
        // double x =(100- r)/100;
        double finalValue = initialCost * Math.pow(0.9,years);

        System.out.println("The final value of car  after " + years+ " years is " + finalValue);

    }
}
