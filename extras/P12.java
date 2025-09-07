import java.util.*;
public class P12{
    static double ctof(double c){
        return (c*9/5)+32;
    }
    static double ftoc(double f){
        return (f-32)*5/9;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.C to F 2.F to C");
        int ch=sc.nextInt();
        double t=sc.nextDouble();
        if(ch==1) System.out.println(ctof(t));
        else System.out.println(ftoc(t));
    }
}
