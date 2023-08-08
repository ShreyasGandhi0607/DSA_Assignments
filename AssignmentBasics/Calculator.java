package AssignmentBasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = in.nextInt();
        System.out.print("Enter operator(\n'+'\n'*'\n'/'\n'-'\n) : ");
        char op = in.next().trim().charAt(0);
        float result = 0f;
        switch(op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("The result is : " + result);
    }
}
