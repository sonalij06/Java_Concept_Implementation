import java.io.IOException;

public class ThrowsException {
    public static void main(String[] args) throws IOException {
        //object of class
        ThrowsException e = new ThrowsException();
        //calling method which throw exception
        e.exception();
//        try{
//            e.exception();
//        }
//        catch(Exception ex)
//        {
//            System.out.print(ex);
//        }
    }
    //method which throw exception
    void exception()throws IOException
    {
         throw new IOException("This is a exception.");
    }
}
