package ConditionalLoopAssign;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = in.nextInt();
        if(n%4 == 0){
            if(n%100 == 0){
                if(n%400 == 0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                System.out.println("Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
    
}
