package Lesson18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main1 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/Lesson18/pexels-anna-shvets-4587956.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("lesson18/copy.jpg"));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (java.io.IOException e) {
            System.out.println(e.toString());
        }
    }
}
