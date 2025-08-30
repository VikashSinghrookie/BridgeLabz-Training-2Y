package Array_practice.level2;

import java.util.Scanner;
public class q_9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int [][]marks=new int[n][3];   // 2D array: n students × 3 subjects
        int []res=new int[n];
        String []grade=new String[n];

        for(int i=0;i<n;i++){
            System.out.println("Input physics no for student "+(i+1));
            marks[i][0]= sc.nextInt();
            System.out.println("Input chemistry no for student "+(i+1));
            marks[i][1]= sc.nextInt();
            System.out.println("Input maths no for student "+(i+1));
            marks[i][2]= sc.nextInt();
        }

        for(int i=0;i<n;i++){
            res[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
            if (res[i]>80){
                grade[i]="A";
            }
            else if(res[i]>=70 && res[i]<=79){
                grade[i]="B";
            } else if (res[i]>=60 && res[i]<=69) {
                grade[i]="C";
            } else if (res[i]>=50 && res[i]<=59) {
                grade[i]="D";
            } else if (res[i]>=40 && res[i]<=49) {
                grade[i]="E";
            }
            else {
                grade[i]="R";
            }
        }

        for(int i=0;i<n;i++){
            System.out.println("Student"+(i+1));
            System.out.println("Physics: "+marks[i][0]+" Chemistry: "+marks[i][1]+" Maths: "+marks[i][2]);
            System.out.println("percentage :"+res[i]+"%");
            System.out.println("Grade :"+grade[i]);
        }
    }
}

