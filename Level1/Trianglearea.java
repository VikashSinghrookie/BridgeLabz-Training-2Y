import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b, h;
        System.out.print("base: ");
        base = input.nextDouble();
        System.out.print("height: ");
        height = input.nextDouble();
        double areaInInches= 0.5*b*h;
        double areaInCm= areaInInches*6.4516;
        System.out.println("The area of triangle in square inches is " + areaInInches + " and in square centimeters is " + areaInCm);
    }
}
