package ConditionalLoopAssign;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int rem = 0;
    int sum = 0;
    while(n>0){
        rem = n%10;
        sum += rem;
        n = n/10;
    }
    System.out.println("The sum of digits of number is " + sum);
    }
    
}
