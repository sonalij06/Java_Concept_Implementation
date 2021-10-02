public class InterfaceInJava implements InJava{
    public static void main(String[] args)
    {
        //object of class contains implementation of interface
        InterfaceInJava in = new InterfaceInJava();
        //method of interface
        in.method_1();
    }
    //implementation of method of interface
    public void method_1()
    {
        System.out.println("This is a method 1.");
    }
}
//interface
interface InJava
{
    void method_1();
}
