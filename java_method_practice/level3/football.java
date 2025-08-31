package java_method_practice.level3;
import java.util.*;

public class football {
    public static int sum(int[] a){
        int s=0;
        for(int x:a) s+=x;
        return s;
    }
    public static int mean(int[] a){
        return sum(a)/a.length;
    }
    public static int min(int[] a){
        int m=a[0];
        for(int x:a) if(x<m) m=x;
        return m;
    }
    public static int max(int[] a){
        int m=a[0];
        for(int x:a) if(x>m) m=x;
        return m;
    }
    public static void main(String[] args){
        Random r=new Random();
        int[] h=new int[11];
        for(int i=0;i<11;i++) h[i]=r.nextInt(101)+150; // 150-250
        System.out.println("heights: "+Arrays.toString(h));
        System.out.println("mean: "+mean(h));
        System.out.println("shortest: "+min(h));
        System.out.println("tallest: "+max(h));
    }
}

