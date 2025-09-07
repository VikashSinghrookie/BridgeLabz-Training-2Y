import java.util.*;
public class P5{
    static int guess(Random r){
        return r.nextInt(100)+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int g;
        String f="";
        while(!f.equals("correct")){
            g=guess(r);
            System.out.println("Is it "+g+"? (high/low/correct)");
            f=sc.next();
        }
        System.out.println("Number found!");
    }
}
