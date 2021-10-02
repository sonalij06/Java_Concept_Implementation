public class DefaultMethodInterface {
    public static void main(String[] args)
    {
        //onject of class contains class method
        Implemented2 in = new Implemented2();
        //Calling class method
        in.class_method();
        //Calling interface method
        in.inter_method();
    }
}
//class which implements interface
class Implemented2 implements defaultinter
{
     void class_method()
    {
        System.out.println("This is a method of class.");
    }
}
//interface with default method
interface defaultinter
{
    default void inter_method()
    {
        System.out.println("This is a default method of interface.");
    }
}
