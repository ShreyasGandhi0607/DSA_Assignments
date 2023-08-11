package ConditionalLoopAssign;

import java.util.Scanner;

/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

 */
public class Leetcode1 {
    public static void main(String[] args) {
        System.out.println("ENter the num :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int rem = 0;
        int sum = 0;
        int product = 1;
        while(n>0){
            rem = n%10;
            sum = sum + rem;
            product = product * rem;
            n = n/10;
        }
        System.out.println("result is ");
        System.out.println(product - sum);
        
    }
}
