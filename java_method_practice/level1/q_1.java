package java_method_practice.level1;

import java.util.Scanner;
public class q_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal");
        int p=sc.nextInt();
        System.out.println("enter rate");
        int r=sc.nextInt();
        System.out.println("enter time");
        int t=sc.nextInt();
        int si=calculateSimpleInterest(p,r,t);
        System.out.println("the simple interest is "+si+" for principal "+p+", rate of interest "+r+" and time "+t);
    }
    public static int calculateSimpleInterest(int p,int r,int t){
        return (p*r*t)/100;
    }
}
