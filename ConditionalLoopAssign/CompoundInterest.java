package ConditionalLoopAssign;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p, r, n ;
        int t;
        double CI;
        System.out.print("Enter the principal amount : ");
        p = in.nextDouble();
        System.out.println("");
        System.out.print("Enter rate of interest (as a percentage):");
        r= in.nextDouble();
        System.out.println("");
        System.out.print("Enter time period:");
        t  = in.nextInt();

        CI = ( p * Math.pow(1 + r/100,t) ) - p;
        System.out.println("Compound Interest is " + CI);
    
    }   
}
