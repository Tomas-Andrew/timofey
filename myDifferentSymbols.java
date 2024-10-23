import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class myDifferentSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String maxUniqueString = "";
        int maxUniqueCount = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            int uniqueCount = countUniqueCharacters(input);
            if (uniqueCount > maxUniqueCount) {
                maxUniqueString = input;
                maxUniqueCount = uniqueCount;
            }
        }
        System.out.println("Ответ: " + maxUniqueString);
        scanner.close();
    }
    private static int countUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
    }
}
