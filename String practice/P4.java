import java.util.*;
public class P4{
    static String rem(String s){
        String r="";
        for(char ch:s.toCharArray()){
            if(r.indexOf(ch)==-1) r+=ch;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(rem(s));
    }
}
