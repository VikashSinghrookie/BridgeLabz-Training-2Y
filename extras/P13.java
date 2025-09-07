import java.util.*;
public class P13{
    static int add(int a,int b){return a+b;}
    static int sub(int a,int b){return a-b;}
    static int mul(int a,int b){return a*b;}
    static double div(int a,int b){return (double)a/b;}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add 2.Sub 3.Mul 4.Div");
        int ch=sc.nextInt();
        int a=sc.nextInt(),b=sc.nextInt();
        if(ch==1) System.out.println(add(a,b));
        else if(ch==2) System.out.println(sub(a,b));
        else if(ch==3) System.out.println(mul(a,b));
        else if(ch==4) System.out.println(div(a,b));
    }
}
