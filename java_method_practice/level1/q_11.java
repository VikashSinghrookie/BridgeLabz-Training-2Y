package java_method_practice.level1;

import java.util.Scanner;
public class q_11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter angle in degrees");
        double angle=sc.nextDouble();
        double arr[]=calculateTrigonometricFunctions(angle);
        System.out.println("sine: "+arr[0]+" cosine: "+arr[1]+" tangent: "+arr[2]);
    }
    public static double[] calculateTrigonometricFunctions(double angle){
        double rad=Math.toRadians(angle);
        double sin=Math.sin(rad);
        double cos=Math.cos(rad);
        double tan=Math.tan(rad);
        return new double[]{sin,cos,tan};
    }
}

