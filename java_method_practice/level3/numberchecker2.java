package java_method_practice.level3;
import java.util.*;

public class numberchecker2 {
    public static int[] digits(int n){
        String s=n+"";
        int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';
        return d;
    }
    public static int sum(int[] d){
        int s=0;for(int x:d) s+=x;return s;
    }
    public static int sqsum(int[] d){
        int s=0;for(int x:d) s+=Math.pow(x,2);return s;
    }
    public static boolean harshad(int n,int[] d){
        return n%sum(d)==0;
    }
    public static int[][] freq(int[] d){
        int[][] f=new int[10][2];
        for(int i=0;i<10;i++) f[i][0]=i;
        for(int x:d) f[x][1]++;
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] d=digits(n);
        System.out.println("sum: "+sum(d));
        System.out.println("sq sum: "+sqsum(d));
        System.out.println("harshad: "+harshad(n,d));
        int[][] f=freq(d);
        for(int i=0;i<10;i++) if(f[i][1]>0) System.out.println(f[i][0]+":"+f[i][1]);
    }
}

