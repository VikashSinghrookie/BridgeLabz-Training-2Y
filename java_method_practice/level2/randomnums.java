package java_method_practice.level2;
import java.util.*;

public class randomnums {
    public static void main(String[] args){
        Random r=new Random();
        int n1=r.nextInt(100)+1;
        int n2=r.nextInt(50)*2+1;
        int n3=r.nextInt(50)*2+2;
        System.out.println("random 1-100: "+n1);
        System.out.println("random odd: "+n2);
        System.out.println("random even: "+n3);
    }
}

