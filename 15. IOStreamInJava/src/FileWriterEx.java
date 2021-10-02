
import java.io.FileWriter;
public class FileWriterEx {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("C:\\Users\\User\\IdeaProjects\\IOStreamInJava\\src\\text.txt");
            fw.write("Welcome to Java.");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}