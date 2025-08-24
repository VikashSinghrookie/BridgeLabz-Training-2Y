import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("number of students: ");
        n = input.nextInt();
        int h = (n*(n-1))/2;
        System.out.println("The maximum number of handshakes is " + h);
    }
}
