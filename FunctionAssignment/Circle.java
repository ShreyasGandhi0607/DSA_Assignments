package FunctionAssignment;

import java.util.Scanner;

public class Circle {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r  = in.nextInt();
        Circumference(r);
        Area(r);


    }

    static void Circumference(int r ){
        double pi = 3.14;
        double cf = 2 * pi *r ;
        System.out.println("Circumference is " + cf);
    }

    static void Area(int r ){
        double pi = 3.14;
        double cf =  pi *r*r ;
        System.out.println("Area is " + cf);
    }
}
