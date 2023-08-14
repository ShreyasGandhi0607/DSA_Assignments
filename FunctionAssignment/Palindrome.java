package FunctionAssignment;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2002));
    }
    static boolean isPalindrome(int n){
        int temp = 0, rem, og;
        og = n;
        while(n>0){
            rem = n%10;
            temp = temp*10 + rem;
            n= n/10;
        }
        if (temp ==og ){
            return true;
        }
        return false;
    }
}
