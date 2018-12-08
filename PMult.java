//Пример работы ввода данных с консоли
//Для получения ввода с консоли в классе System определен объект in. Однако непосредственно через объект System.in не очень удобно работать, поэтому, как правило, используют класс Scanner, который, в свою очередь использует System.in. Например, напишем маленькую программу, которая осуществляет ввод чисел:

import java.util.Scanner;

public class PMult {
    public static void main (String[] args) {
        System.out.print("Умножение ");

//        Для создания самого объекта Scanner в его конструктор передается объект System.in. После этого мы можем получать вводимые значения.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите f1 = ");

//        Чтобы получить введенное число, используется метод in.nextInt();, который возвращает введенное с клавиатуры целочисленное значение.
        int f1 = in.nextInt();

        System.out.println("Введите f2 = ");
        int f2 = in.nextInt();
        int mult = f1 * f2;
        System.out.print("= " + mult);
    }
}

//    String f1 = args[0];
//    String f2 = args[1];
//    String mult = f1+f2;

/*
    int f1 = Integer.valueOf(args[0]);
    int f2 = Integer.valueOf(args[1]);
    int mult = f1*f2;
*/
