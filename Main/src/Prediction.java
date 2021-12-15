import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Prediction {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("Main/src/borodino.txt"), UTF_8);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер строки в диапазоне 1.." + lines.size());
        int n = in.nextInt();
        System.out.println("Вот предсказание для вас:\n" + lines.get(n - 1));

        // Cпособы обработать кейс неверного номера строки не в ожидаемом диапазоне:
        /* 1)добавить в программу if
        int n = in.nextInt();
        if (n < lines.size()) {
            System.out.println("Вот предсказание для вас:\n" + lines.get(n));
        }
        else {
            System.out.println("Вы ввели недопустимый номер..." );
        }
        */

        // 2) перехватить исключение
        try {
            System.out.println("Вот предсказание для вас:\n" + lines.get(n));
        }
        catch (Exception e) {
            System.out.println("Вы ввели недопустимый номер..." );
        }
    }
}
