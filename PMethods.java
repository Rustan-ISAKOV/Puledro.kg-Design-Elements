public class PMethods {
    public static void main(String[] args){
        System.out.println("MAIN");
        hello();
        good();
        int a = 22;
        int b = 33;
        summa(a, b);
    }

    static void hello(){
        System.out.println("2 метод");
    }

    static void good(){
        System.out.println("3 method");
    }

    static void summa(int a, int b){
        int summa = a + b;
        System.out.println("Сумма числе  = " + summa);
    }
}