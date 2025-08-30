package Array_practice.level1;

import java.util.*;
public class double_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter rows: ");
        int rows = sc.nextInt();
        System.out.print("enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("enter the matrix elements:");
        for (int i=0; i<rows;i++) {
            for (int j=0;j<cols;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows*cols];
        int index =0;
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                array[index++]=matrix[i][j];
            }
        }
        System.out.println("1D Array: " + Arrays.toString(array));
    }
}

