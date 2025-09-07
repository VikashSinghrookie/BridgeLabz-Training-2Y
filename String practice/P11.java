import java.util.*;
public class P11{
    static boolean ana(String a,String b){
        if(a.length()!=b.length()) return false;
        char[] x=a.toCharArray();
        char[] y=b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x,y);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(ana(a,b)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}
