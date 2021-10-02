public class ThrowExceptionOwnMsg {
    public static void main(String[] args)
    {
        //try block to execute code block
        try{
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.print(c);
        }
        //catch block to handle exception
        catch(Exception e)
        {
            System.out.print("Here occurs an Exception");
        }
    }
}
