package FunctionAssignment;

import java.util.Scanner;

public class SumOfNIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of integers :");
        int n = in.nextInt();
        System.out.println(SumofIntegers(n));
    }    
    static int SumofIntegers(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
