public class NonAbstractMethod {
    public static void main(String[] args)
    {
        //creating object of abstract using subclass
        AbstractClass2 ab = new AbstractSub();

        //calling abstract which overriden by subclass
        ab.Method_1();

        //calling abstract class non - abstract method
        ab.Method_2();

    }
}
//abstract class
abstract class AbstractClass2
{
    //non - abstract method
    public void Method_1()
    {
        System.out.println("This is a method 1.");
    }

    //non - abstract method
    public static void Method_2()
    {
        System.out.println("This is a method 2.");
    }
}
//subclass of abstract class
class AbstractSub extends AbstractClass2
{
    //Overriding non - abstract method of abstract class
    public  void Method_1()
    {
        System.out.println("This is a method 3.");
    }
}