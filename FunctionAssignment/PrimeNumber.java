package FunctionAssignment;

public class PrimeNumber {
    public static void main(String[] args) {
        isPrime(2);
        System.out.println(isPrime(12));
    }
    static boolean isPrime(int n){
        if (n == 1 || n==0 ){
            return false;
        }else{
            for (int i = 2; i < n; i++) {
                if(n%i == 0){

                    return false;
                }
            }
        }
        return true;
    }
}
