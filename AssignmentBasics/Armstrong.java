package AssignmentBasics;

import java.util.Scanner;

public class Armstrong {
    //To find Armstrong Number between two given number.
    public static void main(String[] args) {
        //To find Armstrong Number between two given number.
        // int num1 = 371;
        System.out.print("Enter the num1 : ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int orignalnum ,rem, result=0;
        orignalnum = num1;
        while(orignalnum != 0){
            rem = orignalnum % 10;
            result += Math.pow(rem, 3);
            orignalnum /= 10;
        }

        if(result == num1 ){
            System.out.println(num1+"  is Armstrong number");

        }else{
            System.out.println(num1+"  is not Armstrong number");
        }
        
    }
}
