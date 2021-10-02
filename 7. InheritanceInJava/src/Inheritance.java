public class Inheritance {
    public static void main(String[] args)
    {
        //object of class A
        A a = new A();

        //object of class B
        B b = new B();

        //object of class C
        C c = new C();

        //Calling methods of A
        a.method_1_A();
        a.method_2_A();
        a.method_class();

        //Calling methods of B
        b.method_1_B();
        b.method_2_B();
        b.method_class();

        //Calling methods of C
        c.method_1_C();
        c.method_2_C();
        c.method_class();
    }
}
class A
{
    //First method of class A
    public void method_1_A()
    {
        System.out.println("This is a method_1_A");
    }

    //Second method of class A
    public void method_2_A()
    {
        System.out.println("This is a method_2_A");
    }

    //Third method same in all classes
    public void method_class()
    {
        System.out.println("This is a common method_A");
    }

}
class B extends A
{
    //First method of class B
    public void method_1_B()
    {
        System.out.println("This is a method_1_B");
    }

    //Second method of class B
    public void method_2_B()
    {
        System.out.println("This is a method_2_B");
    }

    //Third method same in all classes
    public void method_class()
    {
        super.method_class();
        System.out.println("This is a common method_B");
    }

}
class C extends B
{
    //First method of class C
    public void method_1_C()
    {
        System.out.println("This is a method_1_C");
    }

    //Second method of class C
    public void method_2_C()
    {
        System.out.println("This is a method_2_C");
    }

    //Third method same in all classes
    public void method_class()
    {
        super.method_class();
        System.out.println("This is a common method_C");
    }
}
