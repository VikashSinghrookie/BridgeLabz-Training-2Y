import java.util.*;
public class P6{
    static int max(int a,int b,int c){
        if(a>=b&&a>=c) return a;
        else if(b>=a&&b>=c) return b;
        else return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Max: "+max(a,b,c));
    }
}
