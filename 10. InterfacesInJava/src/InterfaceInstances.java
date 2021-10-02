public class InterfaceInstances implements InJava2{
    public static void main(String[] args)
    {
        //object of class using interface instance
        InJava2 in = new InterfaceInstances();
        //Calling method of interface
        in.method_1();
    }
    //implementation of method of interface
    public void method_1()
    {
        System.out.println("Interface method.");
    }
}
//interface
interface InJava2
{
    void method_1();
}