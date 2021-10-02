public class TwoInterfaceOneClass {
    public static void main(String[] args)
    {
        //object of class contains implementation of interface
        Implemented im = new Implemented();
        //Calling of method of first interface's method
        im.Method_of_1();
        //Calling of method of second interface's method
        im.Method_of_2();
    }
}
//implementing class of interfaces
class Implemented implements InJava3,InJava4
{
    //implementation of first interface method
    @Override
    public void Method_of_1() {
        System.out.println("Method of first interface.");
    }
    //implementation of second interface method

    @Override
    public void Method_of_2() {
        System.out.println("Method of second interface.");
    }
}
//first interface
interface InJava3
{
    void Method_of_1();
}
//second interface
interface InJava4
{
    void Method_of_2();
}
