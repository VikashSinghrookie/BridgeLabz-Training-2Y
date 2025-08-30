package Array_practice.level1;

import java.util.Scanner;

class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values =new double[10];
        double total=0.0;
        int index=0;
        System.out.println("Enter numbers max 10 and enter 0 or a negative number to stop:");
        while (true) {
            double num=sc.nextDouble();
            if (num<=0 || index==10) {
                break;
            }
            values[index]=num;
            index++;
        }
        System.out.println("\nNumbers entered:");
        for (int i=0;i<index;i++) {
            System.out.print(values[i] + " ");
            total+=values[i];
        }
        System.out.println("\nSum of numbers = " + total);
    }
}

