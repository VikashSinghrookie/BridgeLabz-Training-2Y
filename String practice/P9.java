import java.util.*;
public class P9{
    static char freq(String s){
        int[] arr=new int[256];
        for(char ch:s.toCharArray()) arr[ch]++;
        int max=0;char ans=' ';
        for(int i=0;i<256;i++){
            if(arr[i]>max){
                max=arr[i];
                ans=(char)i;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(freq(s));
    }
}
