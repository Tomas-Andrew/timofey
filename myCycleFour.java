import java.util.Scanner;

public class myCycleFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Введите элемент [%d][%d]: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("вывод первой строки матрицы на экран, где каждый элемент умножается на 3:");
            for (int j = 0; j < cols; j++) {
                System.out.print(array[0][j] * 3 + " ");
            }
            scanner.close();
    }
}