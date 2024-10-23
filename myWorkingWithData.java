import java.util.Scanner;

public class myWorkingWithData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String firstNumberStr = scanner.nextLine();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        int firstNumber = Integer.parseInt(firstNumberStr);
        int maxNumber;
        int minNumber;
        if (firstNumber > secondNumber) {
            maxNumber = firstNumber;
            minNumber = secondNumber;
        } else {
            maxNumber = secondNumber;
            minNumber = firstNumber;
        }
        System.out.println("Большее число: " + maxNumber);
        double minNumberDouble = (double) minNumber;
        System.out.println("Меньшее число (double): " + minNumberDouble);
        scanner.close();
    }
}