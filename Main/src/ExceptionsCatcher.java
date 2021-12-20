public class ExceptionsCatcher {
    public static void main(String[] args) {
            try {
                int a = (int)(Math.random() * 2);
                System.out.println("a = " + a);
                int c[] = { 1/a }; // опасное место #1
                c[a] = 71; // опасное место #2
            }
            catch(ArithmeticException e) {
                System.err.println("деление на 0" + e);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.err.println("out of bound: " + e);
            } // окончание try-catch блока
            System.out.println("after try-catch");
    }
}
