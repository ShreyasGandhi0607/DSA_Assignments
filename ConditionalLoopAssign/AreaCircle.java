package ConditionalLoopAssign;

import java.util.Scanner;

class AreaCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        
        System.out.println("Enter the radius of circle ...");
        r=sc.nextDouble();
        circle(r);

    }
    static void circle(double r){
        float pi = 3.14f;
        double area = pi * r* r ;
        System.out.println("Area of circle is " + area);
    }
}