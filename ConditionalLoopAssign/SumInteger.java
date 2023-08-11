package ConditionalLoopAssign;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumInteger {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int sum = 0;
            int n = 1;
            while(n !=0){
                n = in.nextInt();
                sum = sum + n;

            }
            System.out.println("sum of all numbers is " + sum);
        }
    }
    
}
