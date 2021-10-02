public class ClassNotFoundException extends Exception  {
    public static void main(String[] args)
    {
        //try block to access Undefined Class
        try
        {
//            Class.forName("The Class do not Exist");//uncommenting statements show exception
        }
        //Catch to handle exception
//        catch (ClassNotFoundException e)
//        {
//            System.out.println("There is no class as specified in the path " + e);
//        }
        finally{
            System.out.println("Always occurs.");
        }
    }
}
