package IO;
import java.io.*;
public class test1 {

    public static void main(String[] args) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\Downloads\\v87-115.zip"));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\new1.zip"))) {
            byte[] buffer = new byte[1024];
            int i;
            while ((i = bufferedInputStream.read(buffer, 0, buffer.length)) != -1) {
                bufferedOutputStream.write(buffer, 0, i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
