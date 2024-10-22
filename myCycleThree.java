import java.util.Scanner;

public class myCycleThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        double[] array = new double[length];
        double sum = 0;
        double avg;
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextDouble();
            sum = (sum + array[i]);
        }
        avg = sum / length;
        scanner.close();
        System.out.println("вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое:");
        for (double element : array) {
            System.out.print(element * avg + " ");
        }
    }
}