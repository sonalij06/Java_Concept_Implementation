
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderEx
{
    public static void main(String[] args)
    {
        //Passing filepath
        File file = new File("C:\\Users\\User\\IdeaProjects\\IOStreamInJava\\src\\text.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            //Reads from the file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}