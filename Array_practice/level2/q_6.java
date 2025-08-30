package Array_practice.level2;
import java.util.Scanner;
public class q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weight = new int[n];
        float[] height = new float[n];
        float[] bmi=new float[n];
        String[] status =new String[n];
        for (int i=0;i<n;i++){
            System.out.println("Weight "+(i+1)+":");
            weight[i]= sc.nextInt();
            System.out.println("Height "+(i+1)+":");
            height[i]= sc.nextFloat();
        }
        for(int i=0;i<n;i++){
            bmi[i]=weight[i]/(height[i]*height[i]);
            if(bmi[i]<18.4){
                status[i]="Underweight";
            } else if (bmi[i]>=18.5 && bmi[i]<=24.9) {
                status[i]="Normal";
            } else if (bmi[i]>=25.0 && bmi[i]<=39.9) {
                status[i]="Overweight";
            } else if (bmi[i]>=40.0) {
                status[i]="Obese";

            }
        }
        for (int i=0;i<n;i++){
            System.out.println("Person no "+(i+1));
            System.out.println("Weight : "+(weight[i]));
            System.out.println("Height : "+(height[i]));
            System.out.println("Bmi : "+(bmi[i]));
            System.out.println("Status "+(status[i]));
        }
    }
}
