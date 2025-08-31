package java_method_practice.level3;
import java.util.*;

public class numberchecker4 {
    
    public static boolean isperfect(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) sum+=i;
        }
        return sum==n;
    }
    
    public static boolean isabundant(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) sum+=i;
        }
        return sum>n;
    }
    
    public static boolean isdeficient(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0) sum+=i;
        }
        return sum<n;
    }
    
    public static int fact(int x){
        int f=1;
        for(int i=1;i<=x;i++) f*=i;
        return f;
    }
    
    public static boolean isstrong(int n){
        int sum=0,temp=n;
        while(temp>0){
            int d=temp%10;
            sum+=fact(d);
            temp/=10;
        }
        return sum==n;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("perfect: "+isperfect(n));
        System.out.println("abundant: "+isabundant(n));
        System.out.println("deficient: "+isdeficient(n));
        System.out.println("strong: "+isstrong(n));
    }
}

