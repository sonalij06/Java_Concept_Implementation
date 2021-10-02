
import java.io.BufferedOutputStream;
        import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

    public static void main(String[] args) throws Exception {
        //Specify the path of the file here
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream("C:\\Users\\User\\IdeaProjects\\IOStreamInJava\\src\\text.txt"));

        //Write content in file
        bufferedOutput.write("Line one".getBytes());
        bufferedOutput.write("\n".getBytes());

        //Writes content in file
        bufferedOutput.write(65);
        bufferedOutput.close();
    }
}