package Array_practice.level1;
import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = sc.nextInt();
        int[] table=new int[10];

        System.out.println("\nTable of " + number + ":");
        for (int i=1;i<=10;i++) {
            table[i-1]=number*i;
            System.out.println(number+" * "+i+" = "+table[i - 1]);
        }
    }
}


