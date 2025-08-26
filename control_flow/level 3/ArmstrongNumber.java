import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int org_n=n;
        int sum=0;

        while (org_n != 0) {
            int digit = org_n%10;
            sum+=digit*digit*digit;
            org_n/=10;
        }

        if (sum==n) {
            System.out.println(n +"is an Armstrong Number.");
        } else {
            System.out.println(n +" is NOT an Armstrong Number.");
        }
        sc.close();
    }
}
