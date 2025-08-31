package java_method_practice.level1;

import java.util.Scanner;
public class q_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of students");
        int n=sc.nextInt();
        int h=calculateHandshakes(n);
        System.out.println("maximum handshakes possible: "+h);
    }
    public static int calculateHandshakes(int n){
        return (n*(n-1))/2;
    }
}
