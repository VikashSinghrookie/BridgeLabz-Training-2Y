package java_method_practice.level1;

import java.util.Scanner;
public class q_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        System.out.println("enter divisor");
        int div=sc.nextInt();
        int arr[]=findRemainderAndQuotient(num,div);
        System.out.println("quotient: "+arr[1]+" remainder: "+arr[0]);
    }
    public static int[] findRemainderAndQuotient(int num,int div){
        int remainder=num%div;
        int quotient=num/div;
        return new int[]{remainder,quotient};
    }
}

