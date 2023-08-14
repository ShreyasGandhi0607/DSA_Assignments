package FunctionAssignment;

import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        Sum(a,b);
    }
    static void Sum(int a ,int b ){
        System.out.println("The sum is " + (a+b));
    }
}
