package ConditionalLoopAssign;

import java.util.Scanner;

public class Power {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("TO CALCULATE THE POWER OF a^b");
        System.out.println("Enter a");
        int a = in.nextInt();
        System.out.println("Enter b");
        int b = in.nextInt();
        double pow =1;
        if(a == 0){
            return ;
        }
        else{
            pow = Math.pow(a,b);
        }

        System.out.println(pow);

    }
}
