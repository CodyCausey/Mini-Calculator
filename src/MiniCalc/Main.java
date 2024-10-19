package MiniCalc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calculating = true;

        while (calculating) {

            System.out.println("This is a mini calculator program.");
            System.out.println("Enter:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. Exit");

            System.out.print("Pick Number: ");
            int answer = scanner.nextInt();

            if (answer == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter first  number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            switch (answer) {
                case 1:
                    System.out.println(a + " + " + b + " = " + (addition(a, b)));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + (subtraction(a, b)));
                    break;
                case 3:
                    if (b != 0) {
                        System.out.println(a + " / " + b + " = " + (division(a, b)));
                    } else {
                        System.out.println("Error: Not divisible by 0");
                    }
                    break;
                case 4:
                    System.out.println(a + " * " + b + " = " + (multiplication(a, b)));
                    break;
                default:
                    System.out.println("Invalid: choose a valid number.");
            }

            System.out.println("\nWould you like to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("yes")) {
                System.out.println("Goodbye!");
                calculating = false;
            }
        }
        scanner.close();
    }

    static int addition(int a, int b) {
        return a + b;
    }
    static int subtraction (int a, int b) {
        return a - b;
    }
    static double division (int a, int b) {
        return (double) a / b;
    }
    static int multiplication (int a, int b) {
        return a * b;
    }
}