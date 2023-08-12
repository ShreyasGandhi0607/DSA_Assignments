package ConditionalLoopAssign;

public class NCR {
    public static void main(String[] args) {
        double n , r,ncr;
        n = 5;
        r = 3;
        ncr =  fact(n)/(fact(r)*fact(n-r));
        System.out.println("The value of ncr is " + ncr);
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
