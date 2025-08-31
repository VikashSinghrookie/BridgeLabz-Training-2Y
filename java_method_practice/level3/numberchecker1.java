package java_method_practice.level3;
import java.util.*;

public class numberchecker1 {
    public static int count(int n){
        return String.valueOf(n).length();
    }
    public static int[] digits(int n){
        String s=n+"";
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static boolean duck(int[] d){
        for(int x:d) if(x==0) return true;
        return false;
    }
    public static boolean armstrong(int n,int[] d){
        int p=d.length,sum=0;
        for(int x:d) sum+=Math.pow(x,p);
        return sum==n;
    }
    public static int[] largest(int[] d){
        int l=Integer.MIN_VALUE,sl=Integer.MIN_VALUE;
        for(int x:d){
            if(x>l){sl=l;l=x;}
            else if(x>sl && x<l) sl=x;
        }
        return new int[]{l,sl};
    }
    public static int[] smallest(int[] d){
        int s=Integer.MAX_VALUE,ss=Integer.MAX_VALUE;
        for(int x:d){
            if(x<s){ss=s;s=x;}
            else if(x<ss && x>s) ss=x;
        }
        return new int[]{s,ss};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] d=digits(n);
        System.out.println("count: "+count(n));
        System.out.println("duck: "+duck(d));
        System.out.println("armstrong: "+armstrong(n,d));
        System.out.println("largest/2nd: "+Arrays.toString(largest(d)));
        System.out.println("smallest/2nd: "+Arrays.toString(smallest(d)));
    }
}

