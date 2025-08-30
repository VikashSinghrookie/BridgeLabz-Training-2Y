package Array_practice.level2;

import java.util.Scanner;
public class q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i=0; i<number;i++) {
            System.out.println("Person "+(i+1)+":");
            do {
                System.out.print("Enter weight:");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid Weight");
                }
            } while (personData[i][0] <= 0);
            do {
                System.out.print("Enter height (m):");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid height");
                }
            } while (personData[i][1] <= 0);
        }
        for (int i=0;i<number;i++) {
            personData[i][2]=personData[i][0]/(personData[i][1]*personData[i][1]);
            if(personData[i][2]<18.5){
                weightStatus[i]="Underweight";
            } else if(personData[i][2]<25){
                weightStatus[i]="Normal";
            } else if(personData[i][2]<30){
                weightStatus[i]="Overweight";
            } else{
                weightStatus[i]="Obese";
            }
        }
        System.out.println("Results:");
        for (int i=0;i<number;i++){
            System.out.println("Person"+(i+1)+":" +
                    "Weight="+personData[i][0]+"kg,"+"Height="+personData[i][1]+"m, " +
                    "BMI="+(personData[i][2])+", "+"Status="+weightStatus[i]);
        }
    }
}
