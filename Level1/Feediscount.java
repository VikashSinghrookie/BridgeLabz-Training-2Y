import java.util.Scanner;

public class Feediscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee, dp;
        System.out.print("Enter fee: ");
        fee = input.nextDouble();
        System.out.print("Enter discount percent: ");
        dp = input.nextDouble();
        double d = (fee * dp) / 100;
        double finalFee = fee - d;
        System.out.println("The discount amount is INR " + d + " and final discounted fee is INR " + finalFee);
    }
}
