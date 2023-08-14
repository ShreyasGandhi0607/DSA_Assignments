package FunctionAssignment;

public class FactorialMethod {
    public static void main(String[] args) {
        Factorial(5);
        for (int i = 0; i <=10; i++) {
            Factorial(i);
        }
    }
    static void Factorial(int n){
        int fact = 1;
        if(n == 0 || n ==1){
            System.out.println("Factorial of " + n +" is: 1" );
        }else{
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
    }
        System.out.println("The Factorial of " + n + " is " + fact);
    }
}
