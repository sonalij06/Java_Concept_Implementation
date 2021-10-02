public class Private_Modifier {
    //private variable of same class
    static private int a = 100;

    public static void getter()
    {
        System.out.println(a);
    }

    //Private Method in same class
    private static void Private_Method()
    {
        System.out.println("This is same class private method.");
    }

    public static void main(String[] args)
    {
        //object of subclass A
        A a = new A();

        //printing private variable of same class
        System.out.print("Variable of same class : " );
        getter();

        //printing private method of same class
        Private_Method();

        //Calling private Variable of subclass
        a.setter(111);
        System.out.println("Private variable of subclass : " + a.getter_sub());

        //calling private method of subclass
        a.call_method();
    }
}
//subclass
class A extends Private_Modifier
{
    //private variable of subclass
    private int Variable = 1234;

    //private method of subclass
    private  void Method()
    {
        System.out.println("This is a private method of subclass.");
    }

    //setter for calling private Variable
    public void setter(int Variable)
    {
        this.Variable = Variable;
    }

    //getter for returning private Variable
    public int getter_sub()
    {
        return this.Variable;
    }

    //call_method for calling private method of subclass
    public void call_method()
    {
        Method();
    }
}
