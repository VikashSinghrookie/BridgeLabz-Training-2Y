package java_method_practice.level1;

import java.util.Scanner;
public class q_6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int sum=calculateSum(n);
        System.out.println("sum of first "+n+" natural numbers is "+sum);
    }
    public static int calculateSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}

