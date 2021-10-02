import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptionEx extends Throwable {
    public static void main(String []args)
    {
        File file = new File("C:\\Users\\User\\IdeaProjects\\ExceptionInJava\\src\\src\\test.txt");
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);
            fileInputStream.read();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally{
            try{
                if (fileInputStream != null){
                    fileInputStream.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
