package FunctionAssignment;

public class PythagorianTrplet {
    public static void main(String[] args) {

        System.out.println(isTriplet(12, 16, 20));
    }
    static boolean isTriplet(int a, int b, int c){
        int max = a;
        if(b>max && b>c){
            max = b;
        }else{
            max = c;
        }
        // System.out.println(max);

        if(max == a && (a*a == b*b + c*c)){
            return true;

        }else if(max == b && ( b*b == a*a + c*c)){
            return true;
        }else if(max == c && (c*c == a*a + b*b )){
            return true;
        }else{
            return false;
        }
    }
}
