package ConditionalLoopAssign;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        // long n = in.nextLong();
        // isPerfect(456);

        for (int i = 0; i < 10000; i++) {
            isPerfect(i);
        }
    }

    static void isPerfect(int n){
        int sum = 0;
        int i = 1;
        while(i<=n/2){
            if(n%i == 0){
                sum += i;
            }
            i++;
        }

        if(sum == n){
            // System.out.println("Perfect Number");
            System.out.println(n);
        }
        // else{
        //     System.out.println("Not a Perfect Number");
        // }
    }


    
}
