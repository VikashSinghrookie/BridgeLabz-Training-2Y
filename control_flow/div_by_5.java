package control_flow;
import java.util.*;

public class div_by_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number");
        int n=sc.nextInt();
        if (n%5==0){
            System.err.println("dividible by 5");
        }
        else {
            System.err.println("not divisible by 5");
        }


    }
    
}
