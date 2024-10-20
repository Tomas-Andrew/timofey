import java.util.Scanner;

public class myConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        int x = scanner.nextInt();
        if (x==1){
            System.out.print("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - унции, 4 - пуд: ");
            int y = scanner.nextInt();
            System.out.print("Введите число: ");
            double z = scanner.nextDouble();
            if (y == 1) {
                System.out.println(z + " грамм");
            } else if (y == 2) {
                System.out.println((z * 1000) + " килограмм");
            } else if (y == 3) {
                System.out.println((z * 0.035274) + " унций");
            } else if (y == 4) {
                System.out.println((z * 0.000061) + " пудов");
            } else {
                System.out.println("Ошибка");
            }
        }
        if (x==2){
        System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
        int y = scanner.nextInt();
        System.out.print("Введите число: ");
        double z = scanner.nextDouble();
        if (y == 1) {
            System.out.println(z + " метров");
        } else if (y == 2) {
            System.out.println((z * 0.000621) + " миль");
        } else if (y == 3) {
            System.out.println((z * 1.09) + " ярдов");
        } else if (y == 4) {
            System.out.println((z * 3.28) + " футов");
        } else {
            System.out.println("Ошибка");
        }
    }
}
}
