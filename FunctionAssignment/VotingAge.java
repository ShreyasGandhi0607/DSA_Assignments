package FunctionAssignment;

public class VotingAge {
    public static void main(String[] args) {
        Eligible(65);
    }
    static void Eligible(int age){
        if (age >= 18 && age <=65 ){
            System.out.println("Eligible");
            }else{
                System.out.println("Not eligible");
                }
    }
}
