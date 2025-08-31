package java_method_practice.level2;
import java.util.*;

public class number {
    public static int check(int n){
        if(n<0) return -1;
        else if(n>0) return 1;
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=check(n);
        if(r==-1) System.out.println("negative");
        else if(r==1) System.out.println("positive");
        else System.out.println("zero");
    }
}

