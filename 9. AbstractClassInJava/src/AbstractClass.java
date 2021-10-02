public class AbstractClass extends ClassWithabstract{
public static void main(String[] args)
{
    //object of class
    ClassWithabstract ab = new AbstractClass();

    //calling abstract and non - abstract method of abstract class
    ab.method_1();//abstract method
    ab.method_2();//non - abstract method
}

//implementing abstract method of abstract class
    void method_1()
    {
        System.out.println("This is a method 1.");
    }
}
//abstract class
abstract class ClassWithabstract
{

    //Abstract method in abstract class
    abstract void method_1();

    //Non - Abstract method in abstract class
    public void method_2()
    {
        System.out.println("This is a method 2.");
    }


}
