import java.util.*;
public class Discount_percent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total fee as input:");
        int f=sc.nextInt();
        System.out.printf("The discount amount is INR %d and final discounted fee is INR %d",f/10,f*9/10);
    }

}