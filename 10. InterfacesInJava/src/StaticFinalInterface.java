public class StaticFinalInterface implements inte_4{
    public static void main(String[] args)
    {
        //object of implementing class
        StaticFinalInterface st = new StaticFinalInterface();

        //class implemented method
        inte_4.meth1();
        st.meth2();

        //public field of interface changed in class
        System.out.println(st.num);
        System.out.println(st.a);
        System.out.println(st.name);
    }
    void meth2()
    {
        System.out.println("Final");
    }
}
interface inte_4
{
    //static field
    static int num = 101;

    //static final field
    static final int a = 1000;

    //final field
    final String name = "Sonali";

    public static void meth1()
    {
        System.out.println("This is a static method.");
    }


    }
