package Array_practice.level2;

import java.util.Scanner;
public class q_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String[] names={"Amar","Akbar","Anthony"};
        int[] ages=new int[3];
        int[] heights=new int[3];

        for(int i=0;i<3;i++){
            System.out.println("enter age of "+names[i]);
            ages[i]=sc.nextInt();
            System.out.println("enter height of "+names[i]);
            heights[i]=sc.nextInt();
        }

        int youngestIndex=0;
        int tallestIndex=0;

        for(int i=1;i<3;i++){
            if(ages[i]<ages[youngestIndex]){
                youngestIndex=i;
            }
            if(heights[i]>heights[tallestIndex]){
                tallestIndex=i;
            }
        }

        System.out.println("youngest friend is: "+names[youngestIndex]+" (age: "+ages[youngestIndex]+")");
        System.out.println("tallest friend is: "+names[tallestIndex]+" (height: "+heights[tallestIndex]+")");
    }
}

