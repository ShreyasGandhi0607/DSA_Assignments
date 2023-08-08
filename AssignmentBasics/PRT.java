package AssignmentBasics;

import java.util.Scanner;

public class PRT {
    public static void main(String[] args) {
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
        //Simple Interest = (P x T x R)/100
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int p = in.nextInt();
        System.out.println("Enter Time : ");
        int t = in.nextInt();
        System.out.println("Enter Rate : ");
        int r = in.nextInt();
        int si = (p*r*t)/100;

        System.out.println("Simple Interest is : " + si);
        
    }
    
}
