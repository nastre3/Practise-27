import java.io.*;
import java.nio.charset.Charset;

public class IOExceptionExample {
    /* Никаких throws и связанных с ним падений */
    public static void main(String[] args)  {
       /* можно указывать все что угодно,
          если не получится, программа вежливо расскажет,
          что именно пошло не так
        */
        if (copyFileUsingStream("C:\\Users\\Anastasia\\IdeaProjects\\Practise-27\\Main\\src\\utf8.txt",
                "utf-8",
                "C:\\Users\\Anastasia\\IdeaProjects\\Practise-27\\Main\\src\\win1251.txt",
                "windows-1251")){
            System.out.println("Перекодировка прошла удачно!");
        }

    }

    /* И здесь все удобно, не падает,
       а рассказывает по-русски, почему не получилось */
    private static boolean copyFileUsingStream(String sourceFilename, String sourceEnc,
                                               String destFilename, String descEnc) {
        Reader fis = null;
        Writer fos = null;
        //Charset sEnc = Charset.forName(sourceEnc);
        //Charset dEnc = Charset.forName(sourceEnc);

        try {
            fis = new InputStreamReader(new FileInputStream(new File(sourceFilename)), sourceEnc);
        } catch (FileNotFoundException e) {
            System.out.println("Проблема с входным файлом");
            return false;
        } catch (UnsupportedEncodingException e) {
            System.out.println("Указана неизвестная кодировка входного файла");
            return false;
        }

        try {
            fos = new OutputStreamWriter(new FileOutputStream(new File(sourceFilename)), descEnc);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Указана неизвестная кодировка выходного файла");
            return false;
        }
        catch (IOException e) {
            System.out.println("Проблема с выходным файлом");
            return false;
        }

        /* все открылось, можно копировать */

        char[] buffer = new char[1024];
        int length;
        try {
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException ex){
            System.out.println("При копировании возникла ошибка");
            return false;
        }
        finally {
            try {
                fis.close();
                fos.close();
            }
            catch (IOException ex){
                System.out.println("Проблема при закрытии файла");
                return false;
            }
        }
        return true;
    }
}