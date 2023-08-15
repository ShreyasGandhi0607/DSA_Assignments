package FunctionAssignment;

public class PrimeBetwnRange {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(long n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
