package MiniCalc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a mini calculator program.");
        System.out.println("Enter:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("Pick Number: ");
        int answer = scanner.nextInt();


        System.out.print("Enter first  number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (answer == 1) {
            System.out.println(a + " + " + b + " = " + (addition(a, b)));
        } else if (answer == 2) {
            System.out.println(a + " - " + b + " = " + (subtraction(a, b)));
        } else if (answer == 3) {
            System.out.println(a + " / " + b + " = " + (division(a, b)));
        } else if (answer == 4) {
            System.out.println(a + " * " + b + " = " + (multiplication(a, b)));
        }
    }

    static int addition(int a, int b) {
        return a + b;
    }
    static int subtraction (int a, int b) {
        return a - b;
    }
    static int division (int a, int b) {
        return a / b;
    }
    static int multiplication (int a, int b) {
        return a * b;
    }
}