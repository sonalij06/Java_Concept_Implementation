public class ThisSuperInMethod extends ToDerive{
    public static void main(String[] args)
    {
        //object of subclass
        ThisSuperInMethod td = new ThisSuperInMethod();
        //Calling method of derived class
        td.call();
    }
    //Default constructor of derived class
    ThisSuperInMethod()
    {
        //calling default constructor of parent class using super
        super();
        System.out.println("This is a default constructor of derived class.");
    }
    //parameterized constructor of derived class
    ThisSuperInMethod(int a)
    {
        //calling default constructor of current class using this
        this();
        System.out.println("This is a parameterized constructor of derived class.");
    }
    //method in derived class
    void call()
    {
        //calling parameterized constructor of current class using constructor
        new ThisSuperInMethod(5);
        System.out.println("This is a method in derived class.");
    }
}
//Super class
class ToDerive
{
    // default constructor
    ToDerive()
    {
        System.out.println("This is a default constructor.");
    }

}
