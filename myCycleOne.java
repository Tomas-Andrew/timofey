import java.util.Scanner;

public class myCycleOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        int x = 10;
        int y = 20;
        int z = 30;
        for (int element : array) {
            if (element == x || element == y || element == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}