import java.util.*;
public class P12{
    static String rep(String s,String w1,String w2){
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(w1)) arr[i]=w2;
        }
        return String.join(" ",arr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w1=sc.next();
        String w2=sc.next();
        System.out.println(rep(s,w1,w2));
    }
}
