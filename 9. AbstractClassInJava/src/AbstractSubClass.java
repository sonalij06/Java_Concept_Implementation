public class AbstractSubClass extends AbstractClass1{
    public static void main(String[] args)
    {
        //creating object of abstract using subclass
        AbstractClass1 a = new AbstractSubClass();

        //Calling method of abstract class
        a.run();
    }
}
//abstract class
abstract class AbstractClass1
{
    //abstract void method_1();
    void run()
    {
        System.out.println("This is a non - abstract method run");
    }
}

