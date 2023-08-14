package ConditionalLoopAssign;

public class EvenDays {
    public static void main(String[] args) {
        int count = 0;
        int n = 1;
        while(n <=31){
            if(n%2 == 0){
                count++;
            }
            n++;
        }
        System.out.println(count);
    }
}
