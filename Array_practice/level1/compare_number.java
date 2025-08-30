package Array_practice.level1;

import java.util.Scanner;
public class compare_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers=new int[5];
        System.out.println("enter 5 numbers :");
        for (int i=0;i<numbers.length;i++) {
            numbers[i]=sc.nextInt();
        }
        for(int n:numbers){
            if (n>0){
                if (n%2==0){
                    System.out.println("number is positive and even");
                }
                else{
                    System.out.println("number is positive and odd");
                }
            }
            else if(n<0){
                System.out.println("number is negative");
            }
            else{
                System.out.println("number is zero");
            }
            
        }
      System.out.println("\ncomparing first and last numbers");
      if (numbers[0]==numbers[4]){
        System.out.println("numbers are same");
      }
      else if(numbers[0]>numbers[4]){
        System.out.println("1st number is greater than last number");
      }
      else{
        System.out.println("1st number is lesser than last number");
      }
        
    }
}

