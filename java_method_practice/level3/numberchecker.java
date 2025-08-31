package java_method_practice.level3;
import java.util.*;

public class numberchecker {
    
    public static int countdigits(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }
    
    public static int[] getdigits(int n){
        int len=countdigits(n);
        int[] arr=new int[len];
        for(int i=len-1;i>=0;i--){
            arr[i]=n%10;
            n/=10;
        }
        return arr;
    }
    
    public static int[] reversearray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        return arr;
    }
    
    public static boolean comparearrays(int[] a,int[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    
    public static boolean ispalindrome(int n){
        int[] d=getdigits(n);
        int[] r=getdigits(n);
        r=reversearray(r);
        return comparearrays(d,r);
    }
    
    public static boolean isduck(int n){
        int[] d=getdigits(n);
        for(int i=1;i<d.length;i++){
            if(d[i]==0) return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("digits count: "+countdigits(n));
        
        int[] d=getdigits(n);
        System.out.print("digits: ");
        for(int x:d) System.out.print(x+" ");
        System.out.println();
        
        int[] r=reversearray(Arrays.copyOf(d,d.length));
        System.out.print("reversed: ");
        for(int x:r) System.out.print(x+" ");
        System.out.println();
        
        System.out.println("palindrome: "+ispalindrome(n));
        System.out.println("duck: "+isduck(n));
    }
}
