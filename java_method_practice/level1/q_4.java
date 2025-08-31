package java_method_practice.level1;

import java.util.Scanner;
public class q_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int result=checkNumber(n);
        if(result==1){
            System.out.println("positive number");
        }else if(result==-1){
            System.out.println("negative number");
        }else{
            System.out.println("zero");
        }
    }
    public static int checkNumber(int n){
        if(n>0) return 1;
        else if(n<0) return -1;
        else return 0;
    }
}

