import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        double result;

        switch (op) {
            case '+':
                result = calc.add(a, b);
                break;
            case '-':
                result = calc.subtract(a, b);
                break;
            case '*':
                result = calc.multiply(a, b);
                break;
            case '/':
                result = calc.divide(a, b);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
