public class StaticClass {
    //Two - static variables
    static int a = 10;
    static int b = 11;
    //Two - instance variables
    int x = 100;
    int y = 200;
    public static void main(String[] args)
    {
        StaticClass s=new StaticClass();
        s.Method1();
        s.Method2();
        SMethod1();
        SMethod2();
    }
    //Two - non-static methods
    public void Method1()
    {
        System.out.println("Non - static 1");
    }
    public void Method2()
    {
        System.out.println("Non - static 2");
    }

    //Two - static methods
    public static void SMethod1()
    {
        System.out.println("Static 1");
    }
    public static void SMethod2()
    {
        System.out.println("Static 2");
    }
}
