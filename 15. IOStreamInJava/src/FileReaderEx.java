
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileReaderEx
{
    public static void main(String[] args)
    {
        //Pass filepath
        File file = new File("C:\\Users\\User\\IdeaProjects\\IOStreamInJava\\src\\text.txt");

        try (FileReader fr = new FileReader(file))
        {
            int content;
            //Reading content of file
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}