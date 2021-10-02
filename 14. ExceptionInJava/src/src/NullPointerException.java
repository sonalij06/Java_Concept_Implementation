public class NullPointerException {
    public static void main(String[] args)
    {
        //try block to execute statement
        try{
            String ptr = null;
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        //catch block to handle exception
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
