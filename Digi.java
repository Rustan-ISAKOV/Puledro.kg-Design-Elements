public class Digi {
    public static void main (String[] arg) {
        System.out.println("Тестируем типы чисел");
        int f1 = Integer.valueOf(arg[0]);
        int f2 = Integer.valueOf(arg[1]);
        int sum = f1 + f2;
        System.out.println("Сумма = " + sum);
    }
}