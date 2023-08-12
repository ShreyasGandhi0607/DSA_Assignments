package ConditionalLoopAssign;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of matches the batsmen played ");
        int n  = in.nextInt();
        double sum = 0;
        double runScored;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the score of match " + (i+1));
            runScored = in.nextDouble();
            sum = sum + runScored;
        }

        double avg = sum / n;
        System.out.println("The average of the batsmen is  : " + avg);



    }
    
}
