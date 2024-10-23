import java.util.Scanner;

public class MyWorkingWithDataTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку из слов, разделенных пробелами: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder latinWords = new StringBuilder();
        int latinWordCount = 0;
        for (String word : words) {
            if (isLatinWord(word)) {
                latinWords.append(word).append(" ");
                latinWordCount++;
            }
        }
        System.out.println("Слова, состоящие только из латиницы: " + latinWords.toString().trim());
        System.out.println("Количество слов, состоящих только из латиницы: " + latinWordCount);
        scanner.close();
    }

    private static boolean isLatinWord(String word) {
        for (char c : word.toCharArray()) {
            if (!Character.isLetter(c) || !Character.UnicodeBlock.of(c).equals(Character.UnicodeBlock.BASIC_LATIN)) {
                return false;
            }
        }
        return true;
    }
}
