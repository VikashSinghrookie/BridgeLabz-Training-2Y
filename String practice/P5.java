import java.util.*;
public class P5{
    static String longest(String s){
        String[] w=s.split(" ");
        String l="";
        for(String x:w){
            if(x.length()>l.length()) l=x;
        }
        return l;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(longest(s));
    }
}
