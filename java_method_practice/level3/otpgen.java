package java_method_practice.level3;
import java.util.*;

public class otpgen {
    
    public static int generateotp(){
        return (int)(100000+Math.random()*900000);
    }
    
    public static boolean checkunique(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=generateotp();
        }
        
        System.out.println("generated otps: "+Arrays.toString(arr));
        if(checkunique(arr)){
            System.out.println("all otps are unique");
        }else{
            System.out.println("duplicate otps found");
        }
    }
}

