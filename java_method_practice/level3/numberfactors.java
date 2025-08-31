package java_method_practice.level3;
import java.util.*;

public class numberfactors {
    
    public static int[] getfactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        int arr[]=new int[count];
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) arr[k++]=i;
        }
        return arr;
    }
    
    public static int greatestfactor(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    
    public static int sumfactors(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        return sum;
    }
    
    public static int productfactors(int[] arr){
        int pro=1;
        for(int i=0;i<arr.length;i++) pro*=arr[i];
        return pro;
    }
    
    public static double cubeproduct(int[] arr){
        double pro=1;
        for(int i=0;i<arr.length;i++) pro*=Math.pow(arr[i],3);
        return pro;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=getfactors(n);
        
        System.out.println("factors: "+Arrays.toString(arr));
        System.out.println("greatest factor: "+greatestfactor(arr));
        System.out.println("sum of factors: "+sumfactors(arr));
        System.out.println("product of factors: "+productfactors(arr));
        System.out.println("product of cube of factors: "+cubeproduct(arr));
    }
}

