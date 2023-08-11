package ConditionalLoopAssign;

import java.util.Scanner;

public class Fibbonnaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print :");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            fibbonci(i);
        }
        // fibbonci(n);


    }

    static void fibbonci(int x){
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= x){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.print(b + " ");
        }

}
    

