package java_method_practice.level2;
import java.util.*;

public class student {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] age=new int[n];
        int[] h=new int[n];
        for(int i=0;i<n;i++){
            age[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        int minage=age[0],maxh=h[0],mini=0,maxi=0;
        for(int i=1;i<n;i++){
            if(age[i]<minage){minage=age[i];mini=i;}
            if(h[i]>maxh){maxh=h[i];maxi=i;}
        }
        System.out.println("youngest index: "+mini+" age: "+minage);
        System.out.println("tallest index: "+maxi+" height: "+maxh);
    }
}

