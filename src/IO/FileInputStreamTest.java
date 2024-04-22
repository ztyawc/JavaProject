package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\test.txt");
            int i;
            while ((i = fileInputStream.read()) != -1) {

                System.out.print((char) i);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
