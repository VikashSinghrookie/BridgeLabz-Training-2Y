import java.util.Scanner;

public class Quotientremainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int quotient= n1 / n2;
        int remainder= n1%n2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + n1 + " and " + n2);
    }
}
