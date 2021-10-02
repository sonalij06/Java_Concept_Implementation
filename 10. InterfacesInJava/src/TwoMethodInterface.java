public class TwoMethodInterface implements InJava1{
    public static void main(String[] args)
    {
        //object of class which contains implementation of interface
        TwoMethodInterface in = new TwoMethodInterface();
        //method of interface
        in.method_2();
    }
    //implementation of interface method
    public  void method_2()
    {
        System.out.println("This is a method 2.");
    }
}
//interface
interface InJava1
{
     default void method_1()
    {

        System.out.println("This is a method 1 implemented.");
    }

      public void method_2() ;
}
