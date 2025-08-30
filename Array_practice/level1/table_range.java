package Array_practice.level1;

import java.util.Scanner;
public class table_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a number: ");
        int number=sc.nextInt();

        System.out.println("\nmultiplication of " + number + " with numbers 6 to 9:");
        for (int i=6;i<=9;i++) {
            int result=number*i;
            System.out.println(number+" * "+i+" = "+result);
        }
    }
}

