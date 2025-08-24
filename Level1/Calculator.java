import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.print("number 1: ");
        num1 = input.nextDouble();
        System.out.print("number 2: ");
        num2 = input.nextDouble();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + 
            (num1+num2) + ", " + (num1-num2) + ", " + (num1*num2) + ", and " + (num1/num2));
    }
}
