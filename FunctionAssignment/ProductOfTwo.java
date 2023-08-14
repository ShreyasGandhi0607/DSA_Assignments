package FunctionAssignment;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = in.nextInt();
        System.out.println("Enter b:");
        int b = in.nextInt();
        Product(a,b);
    }
    static void Product(int a ,int b ){
        System.out.println("The sum is " + (a*b));
    }
}
