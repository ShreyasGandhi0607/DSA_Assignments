package ConditionalLoopAssign;

import java.util.Scanner;

public class Commision {
    public static void main(String[] args) {
        double commission = 1;//comission is a constant, so it
    //can be assigned once and not changed.
    Scanner in = new Scanner(System.in);
    int price;
    double commissionPrice = 0;
    System.out.println("Enter the value of ur flat(in Lacs) ");
    price = in.nextInt();
    if(price <=50 ){
        commission = 2;//percentage
        commission = commission/100;
        commissionPrice = commission * price;
    }
    else{
        commission = 1;
        commission = commission/100;
        commissionPrice = commission * price;
    }

    System.out.println("Price of commision is " + commissionPrice);
    }

}
