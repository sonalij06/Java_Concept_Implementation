import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

class InputStreamEx
{
    public static void main(String[] args)
    {
        //Extracting file using path
        File file = new File("C:\\Users\\User\\IdeaProjects\\IOStreamInJava\\src\\text.txt");

        try (InputStream in = new FileInputStream(file))
        {
            int content;
            //Writing content of file
            while ((content = in.read()) != -1) {
                System.out.print((char)content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
