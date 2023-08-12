package ConditionalLoopAssign;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0; // Added a counter for the number of inputs
        
        System.out.println("Enter numbers (enter 0 to finish):");
        
        int n = in.nextInt();
        while(n != 0) {
            sum = sum + n;
            count++; // Increment the counter
            n = in.nextInt();
        }
        
        if (count > 0) { // Check if there are any numbers to avoid division by zero
            float avg = (float) sum / count; // Convert one of the operands to float for accurate division
            System.out.println("Sum of all numbers is " + sum);
            System.out.println("The average is " + avg);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
