package ConditionalLoopAssign;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double priceOfProduct, discountPercents, totalPriceWithDiscount;
        System.out.print("Enter the product's price: ");
        priceOfProduct = in.nextDouble();
        System.out.println("Enter how much discount to be given :");
        discountPercents = in.nextDouble();
        discountPercents = discountPercents/100;
        totalPriceWithDiscount = priceOfProduct - (discountPercents * priceOfProduct);
        System.out.println("The price after discount is " + totalPriceWithDiscount);

        
    }
    
}
