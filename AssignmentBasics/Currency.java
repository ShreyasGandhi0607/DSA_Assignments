package AssignmentBasics;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        //Write a program to convert rupees to dollars. Take the input from the user.
        //Note: Assume the conversion rate is ₹75/$
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value in rupees : ");
        float rupees = in.nextFloat();
        float dollars = rupees/75f;
        System.out.println("The value of " + rupees + " rupees in dollars is : " + dollars);
    }
    
}
