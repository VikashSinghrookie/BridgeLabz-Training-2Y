import java.util.Scanner;

public class Squareside {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p;
        System.out.print("perimeter of square: ");
        p = input.nextInt();
        int side = p/4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + p);
    }
}
