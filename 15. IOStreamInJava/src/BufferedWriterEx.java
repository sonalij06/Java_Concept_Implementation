import java.io.*;
public class BufferedWriterEx {
    public static void main(String[] args) throws Exception {
        //Passing filepath
        FileWriter writer = new FileWriter("C:\\Users\\User\\IdeaProjects\\IOStreamInJava\\src\\text.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        //Writes to the file
        buffer.write("Welcome to java.");
        buffer.close();
        System.out.println("Success");
    }
}