public class ErrorChecking {
    public static void main(String[] args) {
        System.out.println("Метод main() успешно запущен");
        method1();
        System.out.println("Метод main() заканчивает свою работу");
    }

    static void method1() {
        System.out.println("Первый метод передаёт привет!");
        method2();
    }

    static void method2() {
        System.out.println("Второй метод передаёт привет!");
    }
}