public class StaticMInstanceM {
    public static void main(String[] args)
    {
        //object of class
        StaticMInstanceM i = new StaticMInstanceM();
        //Calling Instance Method using object
        i.InstanceMethod();
    }
    //Instance Method
    public void InstanceMethod()
    {
        //Calling static method
        StaticMethod();
    }
    //Static method
    public static void StaticMethod()
    {
        System.out.println("This is a Static Method");
    }
}
