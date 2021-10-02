
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionFileNotFound {
    public static void main(String[] args) {
        File file = new File("sonali.txt");
        FileInputStream fis = null;
        //try-block to execute block
        try {
            fis = new FileInputStream(file);
            while (fis.read() != -1) {
                System.out.println(fis.read());
            }
        }
        //catch block to handle exception
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //finally block always executes
        finally{
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
