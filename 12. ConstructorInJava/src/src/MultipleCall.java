public class MultipleCall {
    public static void main(String[] args)
    {
        //object of class
        MultipleCall m = new MultipleCall();
        //Several time calling of constructor
        new MultipleCall();
        new MultipleCall();
        new MultipleCall();
    }
    //Default constructor
    MultipleCall()
    {
        System.out.println("Default constructor");
    }
}
