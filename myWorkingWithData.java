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
        } else if (firstNumber < secondNumber){
            maxNumber = secondNumber;
            minNumber = firstNumber;
        } else {
            System.out.println("Числа равны");
            return;
        }
        System.out.println("Большее число: " + maxNumber);
        double minNumberDouble = (double) minNumber;
        System.out.println("Меньшее число (double): " + minNumberDouble);
        scanner.close();
    }
}