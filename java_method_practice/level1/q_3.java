package java_method_practice.level1;

import java.util.Scanner;
public class q_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side 1");
        int a=sc.nextInt();
        System.out.println("enter side 2");
        int b=sc.nextInt();
        System.out.println("enter side 3");
        int c=sc.nextInt();
        int rounds=calculateRounds(a,b,c);
        System.out.println("the athlete must complete "+rounds+" rounds");
    }
    public static int calculateRounds(int a,int b,int c){
        int perimeter=a+b+c;
        return (5000/perimeter);
    }
}

