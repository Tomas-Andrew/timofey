public class myOperator {
    public static void main(String[] args) {
        double x = 12.0;
        double y = 18.0;
        double z = 34.0;
        double a = (x+y+z) / 3;
        System.out.println("Среднее арифметическое" + " = " + a);// Среднее арифметическое
        int b = (int) (a / 2);
        double c = (a / 2);
        System.out.println(b); // Округление в меньшую сторону путем изменения типа на int
        System.out.println((int)c); // Сохранение типа double
        if (c > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
