import java.util.Scanner;

public class myCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double y = Double.parseDouble(scanner.next());
        System.out.print("Выберите действие (+, -, *, /): ");
        String z = scanner.next();
        String no = "Ошибка, введите корректное действие и повторите попытку";
        switch (z) {
            case "+":
                System.out.println("Значение выражения " + (x + y));
                break;
            case "-":
                System.out.println("Значение выражения " + (x - y));
                break;
            case "*":
                System.out.println("Значение выражения " + (x * y));
                break;
            case "/":
                System.out.println("Значение выражения " + (x / y));
                break;
            default:
                System.out.println(no);
        }
    }
}