import java.lang.Exception;
public class NumberFormatException extends Throwable {
    public static void main(String[] args)
    {
        //try block to execute statement
        try {
            String input = "12.222";
            int a = Integer.parseInt(input);
        }
        //catch to handle exception
        catch(Exception ex){
            System.out.println(ex);
            //request for well-formatted string
        }
    }
}
