package AssignmentBasics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //To check whether given String is palindrome or not
        Scanner in = new Scanner(System.in);
        String str = in.next();
        boolean isPalindrome = true;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }
    }
}
