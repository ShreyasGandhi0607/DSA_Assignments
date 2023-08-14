package FunctionAssignment;

public class LargestOf3 {
    public static void main(String[] args) {
        Largest(20,5,0);
    }
    static void Largest(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }else if(c>max){
            max = c;
        }
        System.out.println("The largest number is: "+max);
    }
    
}
