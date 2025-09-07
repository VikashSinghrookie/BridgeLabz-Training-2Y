import java.util.*;
public class P10{
    static String rem(String s,char x){
        String r="";
        for(char ch:s.toCharArray()){
            if(ch!=x) r+=ch;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char x=sc.next().charAt(0);
        System.out.println(rem(s,x));
    }
}
