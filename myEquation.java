import java.util.Scanner;

public class myEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String equation = scanner.nextLine();
        if (equation.length() != 5) {
            System.out.println("Неверный формат уравнения");
            return;
        }
        char firstChar = equation.charAt(0);
        char operator = equation.charAt(1);
        char secondChar = equation.charAt(2);
        char equalsSign = equation.charAt(3);
        char resultChar = equation.charAt(4);
        if (equalsSign != '=' || (operator != '+' && operator != '-')) {
            System.out.println("Неверный формат уравнения");
            return;
        }
        int xPosition = -1;
        if (firstChar == 'x') {
            xPosition = 0;
        } else if (secondChar == 'x') {
            xPosition = 2;
        } else if (resultChar == 'x') {
            xPosition = 4;
        }
        int xValue = 0;
        if (xPosition == 0) {
            int secondValue = Character.getNumericValue(secondChar);
            int resultValue = Character.getNumericValue(resultChar);
            if (operator == '+') {
                xValue = resultValue - secondValue;
            } else {
                xValue = resultValue + secondValue;
            }
        } else if (xPosition == 2) {
            int firstValue = Character.getNumericValue(firstChar);
            int resultValue = Character.getNumericValue(resultChar);
            if (operator == '+') {
                xValue = resultValue - firstValue;
            } else {
                xValue = firstValue - resultValue;
            }
        } else if (xPosition == 4) {
            int firstValue = Character.getNumericValue(firstChar);
            int secondValue = Character.getNumericValue(secondChar);
            if (operator == '+') {
                xValue = firstValue + secondValue;
            } else {
                xValue = firstValue - secondValue;
            }
        }
        System.out.println("x = " + xValue);
        scanner.close();
    }
}
