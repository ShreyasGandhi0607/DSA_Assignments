package ConditionalLoopAssign;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l ,w;
        System.out.println("Enter the length of triangle :");
        l = in.nextDouble();
        System.out.println("Enter the width of triangle :");
        w = in.nextDouble();

    }

    static void AreaTriangle(double l, double w){
        double area = 0.5 * l * w;
        System.out.println("Area of Triangle is " + area);

    }
    
}
