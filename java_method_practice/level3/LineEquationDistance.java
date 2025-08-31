package java_method_practice.level3;
import java.util.Scanner;

public class LineEquationDistance {

    static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    static double[] getLineEquation(int x1, int y1, int x2, int y2) {
        double[] eq = new double[2];
        double m = (double)(y2 - y1) / (x2 - x1);  
        double b = y1 - (m * x1);                  
        eq[0] = m; 
        eq[1] = b;
        return eq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        double distance = getDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        double[] equation = getLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of line: y = " + equation[0] + "x + " + equation[1]);

        sc.close();
    }
}

