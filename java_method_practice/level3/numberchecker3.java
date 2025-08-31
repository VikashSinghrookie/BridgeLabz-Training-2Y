package java_method_practice.level3;
import java.util.*;

public class numberchecker3 {
    
    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static boolean isneon(int n){
        int sq=n*n;
        int sum=0;
        while(sq>0){
            sum+=sq%10;
            sq/=10;
        }
        return sum==n;
    }
    
    public static boolean isspy(int n){
        int sum=0,pro=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            pro*=d;
            n/=10;
        }
        return sum==pro;
    }
    
    public static boolean isautomorphic(int n){
        int sq=n*n;
        String s1=String.valueOf(n);
        String s2=String.valueOf(sq);
        return s2.endsWith(s1);
    }
    
    public static boolean isbuzz(int n){
        return n%7==0 || n%10==7;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("prime: "+isprime(n));
        System.out.println("neon: "+isneon(n));
        System.out.println("spy: "+isspy(n));
        System.out.println("automorphic: "+isautomorphic(n));
        System.out.println("buzz: "+isbuzz(n));
    }
}

