package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class DownloadImage {
    public static void main(String[] args) {
        String imageUrl = "https://www.yaohuo.me/bbs/upload/1000/2024/03/12/5735_135936026c55b96-7447-459d-b954-9604d542d68b.jpeg";
        String destinationFile = "downloaded_image.jpeg";

        try (BufferedInputStream in = new BufferedInputStream(new URL(imageUrl).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
             BufferedOutputStream out = new BufferedOutputStream(fileOutputStream)) {

            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                out.write(dataBuffer, 0, bytesRead);
            }
            System.out.println("Download completed successfully.");
        } catch (IOException e) {
            System.err.println("Error downloading the image: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
