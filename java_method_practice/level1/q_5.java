package java_method_practice.level1;

import java.util.Scanner;
public class q_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter month");
        int month=sc.nextInt();
        System.out.println("enter day");
        int day=sc.nextInt();
        boolean result=isSpringSeason(month,day);
        if(result){
            System.out.println("its a spring season");
        }else{
            System.out.println("not a spring season");
        }
    }
    public static boolean isSpringSeason(int month,int day){
        if((month==3 && day>=20)||(month>3 && month<6)||(month==6 && day<=20)){
            return true;
        }
        return false;
    }
}

