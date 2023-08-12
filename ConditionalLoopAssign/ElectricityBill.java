package ConditionalLoopAssign;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double bill_pay = 15f;
            System.out.println("Enter the number of units to calculate bill :");
            double unit = in.nextFloat();
            if (unit >0 && unit <=100){
                bill_pay = unit * 1.2;        
            }
            else if(unit>100 && unit <300){
                bill_pay = 100* 1.2 + (unit - 100)*2; 
            }else if(unit>300){
                bill_pay = 100* 1.2 + 200*2 + (unit - 300)*3;
            }
            System.out.println("Your bill is  " + bill_pay);
        }
    }
    
}
