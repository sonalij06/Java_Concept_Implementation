
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx {
    public static void main(String[] args)
    {
        try {
                // Store the filepath into the variable filepath of type String.
            String File = "C:\\Users\\User\\IdeaProjects\\IOStreamInJava\\src\\text.txt";

                // Create an object of FileOutputStream class to attach file with FileOutputStream and pass the filepath to its constructor.
            FileOutputStream fos = new FileOutputStream(File);
            fos.write(87);
            fos.close(); // Closing file.

            System.out.println("Successfully written");
        }catch(FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}