import java.util.Scanner;

public class myOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double y = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double z = scanner.nextDouble();

        double a = (x + y + z) / 3;
        System.out.println("Среднее арифметическое" + " = " + a);// Среднее арифметическое

        double b = Math.floor(a / 2);
        System.out.println("Деление среднего арифметического на 2" + " = " + b);
        if (b > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
