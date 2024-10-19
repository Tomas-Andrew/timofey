import java.util.Scanner;

public class myCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double y = scanner.nextDouble();

        System.out.print("Выберите действие (+, -, *, /, %): ");
        String operation = scanner.next();
        double result = performOperation(x, y, operation);
        System.out.println("Значение выражения: " + result);
    }

    public static double performOperation(double x, double y, String operation)
    {
        double result = 0;
        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "%":
                result = x % y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}