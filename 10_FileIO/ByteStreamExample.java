/*
 * Problem: Copy bytes from source.txt to destination.txt using
 *          FileInputStream/FileOutputStream (byte streams, try-with-
 *          resources). Note: the `break` after the first read means it
 *          only copies the first 1024-byte chunk, not the whole file.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample{
    
    public static void main(String[] args){
        try( FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("destination.txt")){

                byte[] buffer = new byte[1024];
                int byteRead;

                while((byteRead = fis.read(buffer)) != -1){
                    fos.write(buffer,0,byteRead);
                    break;
                }

        }catch(IOException e){
            System.err.println("Error copying file! : "+e.getMessage());
        }
    }
}
