public class ArithmeticExceptiontrycatch {
    public static void main(String[] args)
    {
        //try-catch block to handle exception
        try{
            int a = 5 / 0 ;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
