package java_method_practice.level2;
import java.util.*;

public class vote {
    public static boolean canvote(int age){
        return age>=18;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(canvote(age)) System.out.println("eligible to vote");
        else System.out.println("not eligible to vote");
    }
}

