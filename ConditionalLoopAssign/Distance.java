package ConditionalLoopAssign;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x coordinate of A : ");
        int x1 = in.nextInt();
        System.out.print("Enter x coordinate of B : ");
        int x2 = in.nextInt();

        int distance = x2 - x1;
        if (distance < 0){
            distance *= (-1);
        }

        System.out.println("The Distance between A and B is : " + distance);
    }
    
}
