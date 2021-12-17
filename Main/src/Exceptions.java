import java.lang.reflect.Array;

public class Exceptions {
    private static void printLength(String str) {
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        // 1) ArithmeticException
        // деление на ноль
        // int res = 5 / 0;

        // 2) ArrayIndexOutOfBoundsException
        // Индекс массива выходит за допустимые границы.
        /*
        int[] massive = new int[]{1,2};
        for (int i = 0; i < massive.length + 1; i++) {
            System.out.println(massive[i]);
        }
         */

        // 3) ArrayStoreException ?
        // Присвоение элементу массива значения несовместимого типа.
        /* Object x[] = new String[3];
        x[0] = 0;
         */

        // 4) ClassCastException ?
        // Попытка выполнить приведение несовместимых типов.
       /* Object x2 = 0;
        System.out.println((String)x2);
        */

        // 5) NegativeArraySizeException
        // Попытка создать массив отрицательного размера.
        // int[] massive = new int[-1];

        // 6) NullPointerException ?
        // Некорректное использование ссылок (обычно, когда мы вызываем метод объектной переменной, которая содержит пустую ссылку).
        /* String myString = null;
        printLength(myString);
         */

        // 7) NumberFormatException
        // Когда в число преобразуется строка, содержащая некорректное текстовое представление числа
        /* String s = "4s";
        int c = Integer.parseInt(s);
        System.out.println(c);
         */

        // 8) StringIndexOutOfBoundsException ?
        // Неверное индексирование при работе с текстовой строкой.
        String str = "Hello how are you";
        System.out.println(str.charAt(40));
    }
}
