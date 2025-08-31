package java_method_practice.level2;
import java.util.*;

public class bmi {
    public static double calc(double w,double h){
        return w/(h*h);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        double b=calc(w,h);
        System.out.println("bmi: "+b);
        if(b<18.5) System.out.println("underweight");
        else if(b<25) System.out.println("normal");
        else if(b<30) System.out.println("overweight");
        else System.out.println("obese");
    }
}

