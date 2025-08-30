package Array_practice.level2;

import java.util.Scanner;
public class q_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a number: ");
        int number=sc.nextInt();

        int temp=number;
        int count=0;
        while(temp!=0){
            count++;
            temp=temp/10;
        }

        int[] digits=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=number%10;
            number=number/10;
        }

        int[] reverse=new int[count];
        for(int i=0;i<count;i++){
            reverse[i]=digits[count-1-i];
        }

        System.out.print("Reversed number: ");
        for(int i=0;i<count;i++){
            System.out.print(reverse[i]);
        }
    }
}

