public class AbstractMethods {
    public static void main(String[] args)
    {
        //creating object of abstract using subclass
        AbstractClass3 ab = new AbstractSub2();

        //calling abstract methods of abstract method using subclass
        ab.method_1();
        ab.method_2();
    }
}
//abstract class
abstract class AbstractClass3
{
    abstract void method_1();
    abstract void method_2();
    void method_3(){
        System.out.println("This is a method 3.");
    }
}
//subclass of abstract class
class AbstractSub2 extends AbstractClass3
{
    //implementation of abstract methods
    void method_1()
    {
        System.out.println("This is a method 1.");
    }
    void method_2()
    {
        System.out.println("This is a method 2.");
    }
}