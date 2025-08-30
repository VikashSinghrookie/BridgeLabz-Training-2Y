package Array_practice.level1;

import java.util.Scanner;

public class mean_height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights =new double[11];
        double sum=0;
        System.out.println("enter the heights of 11 players:");
        for (int i=0;i<11;i++) {
            heights[i]=sc.nextDouble();
        }

        for (double h : heights) {
            sum+=h;
        }

        double mean=sum/11;
        System.out.println("mean height of the team = " +mean);
    }
}

