import java.util.Random;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        System.err.println("---Задание 1---");

        printlenght(null);

        System.err.println("---Задание 2---");

        int[] num = new int[5];

        try {
            System.out.print(num[5]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.err.println("Выход за пределы массива");
        }

        System.err.println("---Задание 3---");

        try {
            throwBalance(0);
            System.out.println("Деньги есть: ");
        } catch (Excep excep) {
            excep.printStackTrace();
            System.err.println(excep.getBalance());
        }

        System.err.println("---Задание 4---");

        try {
            throwAge(17);
            System.out.println("Проверка пройдена");
        } catch (RunTimeExcep runTimeExcep) {
            runTimeExcep.printStackTrace();
        }

        System.err.println("---Задание 5---");

        try {
            divide(1, 0);
        } catch (Exception mycustomexcep) {
            mycustomexcep.printStackTrace();
        }

        System.err.println("---Задание 6---");

        try {
            randomThrow();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }

    }

    public static void printlenght(String a) {

        try {
            System.out.println(a.length());

        } catch (NullPointerException exception) {
            System.err.println(" Без значения ");

        }
    }

    public static void throwBalance ( int money) throws Excep {
        if (money < 1) {
            throw new Excep("Баланс пуст, трубуется пополнение");
        }
    }

    public static void throwAge ( int age) throws RunTimeExcep {
        if (age <= 18) {
            throw new RunTimeExcep("Доступ запрещен");
        }
    }

    public static void divide(int a, int b) throws MyCustomExcep {
        try {
            int x = a / b;
        } catch (ArithmeticException mycustomexcep) {

            throw new MyCustomExcep("Ошибка при вычислении: ", mycustomexcep);
        }
    }

    public static void randomThrow() throws IOException {
        Random random = new Random();
        int c = random.nextInt(3);

        switch (c) {
            case 0:
                throw new ArithmeticException("Деление на ноль");
            case 1:
                throw new NullPointerException("Null");
            case 2:
                throw new IOException("Ошибка ввода-вывода");
        }
    }
}