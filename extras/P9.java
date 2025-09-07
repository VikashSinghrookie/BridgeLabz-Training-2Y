import java.util.*;
public class P9{
    static boolean pal(String s){
        String r=new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(pal(s)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
