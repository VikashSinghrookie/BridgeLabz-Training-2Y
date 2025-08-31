package java_method_practice.level1;

import java.util.Scanner;
public class q_9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of chocolates");
        int choco=sc.nextInt();
        System.out.println("enter number of children");
        int child=sc.nextInt();
        int arr[]=findRemainderAndQuotient(choco,child);
        System.out.println("each child gets: "+arr[1]+" chocolates");
        System.out.println("remaining chocolates: "+arr[0]);
    }
    public static int[] findRemainderAndQuotient(int num,int div){
        int remainder=num%div;
        int quotient=num/div;
        return new int[]{remainder,quotient};
    }
}
