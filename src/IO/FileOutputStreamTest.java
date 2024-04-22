package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("D:\\Downloads\\v87-115.zip");
            FileOutputStream fileOutputStream=new FileOutputStream("D:\\new.zip");
            int i;
            while ((i=fileInputStream.read())!=-1){
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
