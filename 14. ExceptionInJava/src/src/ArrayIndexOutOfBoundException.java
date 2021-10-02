public class ArrayIndexOutOfBoundException extends Throwable {
    public static void main(String[] args)
    {
        //try block to access undefined element of array
        try{
            int[] a = new int[2];
            a[0] = 0;
            a[1] = 1;
            a[2] = 2;
            System.out.println(a[2]);
        }
        //catch block handle exception
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
