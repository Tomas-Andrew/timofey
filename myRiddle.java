import java.util.Scanner;

public class myRiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String correctAnswer = "Заархивированный вирус";
        System.out.println(riddle);
        int attempts = 3;
        boolean hintUsed = false;
        while (attempts > 0) {
            System.out.print("Ваш ответ: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Правильно!");
                return;
            } else if (userAnswer.equalsIgnoreCase("Подсказка") && attempts == 3 && !hintUsed) {
                System.out.println("Подсказка: Это что-то, что можно распаковать.");
                hintUsed = true;
                attempts--;
            } else if (userAnswer.equalsIgnoreCase("Подсказка") && (attempts == 2 || attempts == 1)) {
                System.out.println("Подсказка уже недоступна.");
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Подумай еще!");
                }
            }
        }
        System.out.println("Обидно, приходи в другой раз");
        scanner.close();
    }
}
