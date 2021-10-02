public class MultipleCatch {
    public static void main(String[] args)
    {
        //try block to execute code
        try{
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.print(c);
        }

        //catch block to handle arithmetic block
        catch(ArithmeticException e)
        {
            System.out.print(e);
        }
        //catch block to handle null pointer exception
        catch(Exception e)
        {
            System.out.print(e);
        }
    }

}
