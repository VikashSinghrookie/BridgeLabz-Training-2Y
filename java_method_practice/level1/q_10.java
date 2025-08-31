package java_method_practice.level1;

import java.util.Scanner;
public class q_10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter temperature");
        double temp=sc.nextDouble();
        System.out.println("enter wind speed");
        double wind=sc.nextDouble();
        double result=calculateWindChill(temp,wind);
        System.out.println("wind chill is: "+result);
    }
    public static double calculateWindChill(double temp,double wind){
        return 35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(wind,0.16);
    }
}

