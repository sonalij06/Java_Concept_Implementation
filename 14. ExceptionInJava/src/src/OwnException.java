import java.io.IOException;

public class OwnException {
    public static void main(String[] args) throws IOException {
        //object of class
        OwnException o = new OwnException();
        //Calling method which throw exception
        o.age(18);
    }
    //Exception throwing method
    void age(int age)throws IOException
    {
        if(age < 18)
        {
            throw new IOException("Age is not 18+.");
        }
        else
        {
            System.out.println("Age is valid.");
        }
    }
}
