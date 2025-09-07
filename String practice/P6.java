import java.util.*;
public class P6{
    static int occ(String s,String sub){
        int c=0;
        for(int i=0;i<=s.length()-sub.length();i++){
            if(s.substring(i,i+sub.length()).equals(sub)) c++;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sub=sc.nextLine();
        System.out.println(occ(s,sub));
    }
}
