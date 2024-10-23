public class myWorkingWithDataOne {
    public static void main(String[] args) {
        String input = "I like Java!!!";
        boolean containsJava = input.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);
        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Строка начинается с 'I like': " + startsWithILike);
        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Строка заканчивается на '!!!': " + endsWithExclamation);
        if (containsJava && startsWithILike && endsWithExclamation) {
            String upperCaseString = input.toUpperCase();
            System.out.println("Строка в верхнем регистре: " + upperCaseString);
        }
        String replacedString = input.replace('a', 'o');
        String substringJovo = replacedString.substring(7, 11);
        System.out.println("Подстрока 'Jovo': " + substringJovo);
    }
}
