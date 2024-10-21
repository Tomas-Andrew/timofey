import java.util.Scanner;

public class myCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текущий курс доллара: ");
        double a = scanner.nextDouble();
        System.out.println("Введите количество рублей");
        double b = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Ошибка");
        } else {
            System.out.printf("%.2f", b / a);
        }
    }
}