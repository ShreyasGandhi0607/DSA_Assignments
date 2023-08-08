package AssignmentBasics;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = in.nextInt();
        int max = num1;
        if(num2>num1){
            max = num2;
        }
        System.out.println("The largest number is : " + max);
    }
}
