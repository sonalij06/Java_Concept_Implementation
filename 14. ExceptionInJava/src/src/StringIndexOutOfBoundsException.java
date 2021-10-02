public class StringIndexOutOfBoundsException {
    public static void main(String[] args)
    {
        //try block to excecute statement
        try{
            String str = "sonali";

            System.out.println(str.charAt(7));
        }
        //catch block to handle exception
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
