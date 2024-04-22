package IO;
import java.io.*;
public class test {
    public static void main(String[] args) {
        try {
            String name="小米电脑管家.zip";
            BufferedInputStream bufferedInputStream=new BufferedInputStream(new FileInputStream("D:\\Downloads\\"+name));
            BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("D:\\"+name));
            byte[] buffer =new byte[1024];
            int i;
            while ((i=bufferedInputStream.read(buffer,0,buffer.length))!=-1){
                bufferedOutputStream.write(buffer,0,i);
                bufferedOutputStream.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
