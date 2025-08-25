package control_flow.level1;

import java.util.Scanner;

public class divby_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        if(n%5==0){
            System.err.println("div by 5");
        }
        else{
            System.err.println("not div by 5");
        }
    }
}
