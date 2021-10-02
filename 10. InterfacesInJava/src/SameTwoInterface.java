public class SameTwoInterface {
    public static void main(String[] args)
    {
        //object of class which contains implementation of interface method
        Implemented1 im = new Implemented1();
        //Calling of method
        im.method();
    }
}
//class which implements method
class Implemented1 implements inter1,inter2
{
//implementation of method
    @Override
    public void method() {
        System.out.println("Method of both interface are same.");
    }
}
//first interface
interface inter1
{
    void method();
}
//second interface
interface inter2
{
    void method();
}
