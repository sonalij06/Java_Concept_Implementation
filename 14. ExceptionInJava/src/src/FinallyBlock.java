public class FinallyBlock {
    public static void main(String[] args)
    {
        try{
            int a = 25/5;
            System.out.println("This is a try-block.");
        }
        catch(Exception e)
        {
            System.out.println("This is a catch-block.");
        }
        finally {
        System.out.println("This is a finally-block.");
    }
        System.out.println("End of code.");
    }
}
