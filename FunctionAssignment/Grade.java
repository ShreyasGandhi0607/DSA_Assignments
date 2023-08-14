package FunctionAssignment;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Subjects :");
        int n = in.nextInt();
        System.out.print("Enter the marks you gained : ");
        int[] marks = new int[10];
        for(int i = 0; i<n ; i++ ){
            marks [i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            grades(marks[i]);
        }
    }
    static void grades(int a){
        if(a>=91 && a<=100){
            System.out.println("\tGrade AA");
        }
        else if(a>=81 && a<=90){
            System.out.println("\tGrade AB");
        }
        else if(a>=71 && a<=80){
            System.out.println("\tGrade BB");
        }
        else if(a>=61 && a<=70){
            System.out.println("\tGrade BC");
        }
        else if(a>=51 && a<=60){
            System.out.println("\tGrade CD");
        }
        else if(a>=41 && a<=50){
            System.out.println("\tGrade DD");
        }else{
            System.out.println("\tFail");
        }
    }
}
