import java.util.Arrays;

public class myArrays {
    public static void main(String[] args) {
        int[] ints = {2, 4, 6, 8, 9};
        int first = ints[0];
        int last = ints[ints.length - 1];
        ints[0] = last;
        ints[ints.length - 1] = first;
        System.out.println(Arrays.toString(ints)); // Отображение измененного массива
        System.out.println(ints[0] + ints[ints.length / 2]); // Сумма первого и среднего элемента массива
    }
}
