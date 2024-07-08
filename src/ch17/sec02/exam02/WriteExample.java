package ch17.sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test3.db");

            byte[] array = {10, 20, 30, 40, 50};

            os.write(array);

            os.flush();
            os.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
