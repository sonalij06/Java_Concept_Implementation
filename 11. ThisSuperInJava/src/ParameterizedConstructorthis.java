public class ParameterizedConstructorthis extends Parent {
    public static void main(String[] args)
    {
        //Object of class
        Parent p = new Parent();
        //Parameterized constructor without this
        //new Parent(5);
    }
}
//SuperClass
class Parent
{
    //Default constructor
    Parent()
    {
        //Parameterized constructor with this
        this(5);
        System.out.println("This is a default constructor.");
    }
    // Parameterized constructor
    Parent(int a)
    {
        System.out.println("This is a Parameterized constructor with variable = " + a);
    }
}
