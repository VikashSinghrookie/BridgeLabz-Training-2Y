package java_method_practice.level2;
import java.util.*;

public class quadratic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        double d=b*b-4*a*c;
        if(d>0){
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("roots: "+r1+" "+r2);
        }else if(d==0){
            double r=-b/(2*a);
            System.out.println("root: "+r);
        }else{
            double re=-b/(2*a);
            double im=Math.sqrt(-d)/(2*a);
            System.out.println("roots: "+re+"+i"+im+" "+re+"-i"+im);
        }
    }
}

