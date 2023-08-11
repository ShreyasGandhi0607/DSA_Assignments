package ConditionalLoopAssign;

import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestNumLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int max = 0;
        while(n!= 0){
            System.out.println("Enter a number: ");
            n = in.nextInt();
            if(n>max){
                max = n;
            }
        }
        System.out.println("The largest number is " + max);
    }
}
