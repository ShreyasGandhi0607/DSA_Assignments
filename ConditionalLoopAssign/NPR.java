package ConditionalLoopAssign;

public class NPR {
    public static void main(String[] args) {
        double n , r,npr;
        n = 5;
        r = 3;
        npr =  fact(n)/fact(n-r);
        System.out.println("The value of ncr is " + npr);
    }
    static double fact(double n){
        int i =1;
        double factorial = 1;
        while(i<=n){
            factorial = factorial *i;
            i++;
        }
        return factorial;
    }
}
