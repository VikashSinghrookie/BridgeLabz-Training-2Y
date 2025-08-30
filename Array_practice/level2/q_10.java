package Array_practice.level2;

import java.util.Scanner;
public class q_10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[]arr=new int[10];
        while(n!=0){
            int i=0;
            int ld=n%10;
            arr[ld]++;
            n=n/10;
        }
        for(int i=0;i<10;i++) {
            if (arr[i] != 0) {
                System.out.println("No :" + (i) + " " + arr[i]);
            }
        }

    }
}
