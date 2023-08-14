package ConditionalLoopAssign;

import java.util.Scanner;

public class SumofDifInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int sumN = 0;
        int sumE = 0;
        int sumO = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                sumN = sumN + arr[i];
            }
            else{
                if(arr[i]%2 == 0){
                    sumE = sumE + arr[i];
                }
                else{
                    sumO = sumO + arr[i];
                }
            }
        }
        System.out.println("Sum of negative numbers is " +sumN );
        System.out.println("Sum of even numbers is "+sumE+" ");
        System.out.println("Sum of odd numbers is"+sumO +"");
    }
}
