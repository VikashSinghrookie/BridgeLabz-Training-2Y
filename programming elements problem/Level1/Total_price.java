import java.util.Scanner;

public class Total_price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double up;
        int qty;
        System.out.print("unit price: ");
        up = input.nextDouble();
        System.out.print("quantity: ");
        qty = input.nextInt();
        double total = up*qty;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + qty + " and unit price is INR " + up);
    }
}
