package java_method_practice.level1;

import java.util.Scanner;
public class q_7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int n1=sc.nextInt();
        System.out.println("enter number 2");
        int n2=sc.nextInt();
        System.out.println("enter number 3");
        int n3=sc.nextInt();
        int arr[]=findSmallestAndLargest(n1,n2,n3);
        System.out.println("smallest: "+arr[0]+" largest: "+arr[1]);
    }
    public static int[] findSmallestAndLargest(int n1,int n2,int n3){
        int smallest=Math.min(n1,Math.min(n2,n3));
        int largest=Math.max(n1,Math.max(n2,n3));
        return new int[]{smallest,largest};
    }
}

