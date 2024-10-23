import java.util.Random;

public class myWorkingWithDataThree {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20; // Диапазон от -20 до 20
        }
        System.out.println();

        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        int maxAbs = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю значение: " + maxAbs);
    }
}
