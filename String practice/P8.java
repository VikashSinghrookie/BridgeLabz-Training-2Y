import java.util.*;
public class P8{
    static void cmp(String a,String b){
        int n=Math.min(a.length(),b.length());
        for(int i=0;i<n;i++){
            if(a.charAt(i)<b.charAt(i)){
                System.out.println(a+" comes before "+b);
                return;
            }
            else if(a.charAt(i)>b.charAt(i)){
                System.out.println(b+" comes before "+a);
                return;
            }
        }
        if(a.length()<b.length()) System.out.println(a+" comes before "+b);
        else if(a.length()>b.length()) System.out.println(b+" comes before "+a);
        else System.out.println("Both are equal");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        cmp(a,b);
    }
}
