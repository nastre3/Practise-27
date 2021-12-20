import java.text.NumberFormat;
import java.text.ParseException;

public class ExceptionCatcher {
    public static void main(String[] args) {
        try {
            NumberFormat nf = NumberFormat.getInstance();
            //специально создаем ситуацию, которая приведет к исключению
            System.out.println(nf.parse("NOT A NUMBER"));
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Конец программы!");

        String string = "123";
        try
        {
            char chr = string.charAt(10);
        }
        catch(StringIndexOutOfBoundsException ex)
        {
            System.out.println(ex.toString());
        }
        System.out.println("Конец программы!");
    }

}
