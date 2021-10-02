public class InstanceMStaticM {
    public static void main(String[] args)
    {
        //Calling static method in main
        StaticMethod();
    }
    //Instance Method
    public void InstanceMethod()
    {
        System.out.println("This is a Instance Method");
    }
    //Static method
    public static void StaticMethod()
    {
        //object of class
        InstanceMStaticM i = new InstanceMStaticM();
        //Calling instance method using object
        i.InstanceMethod();
    }
}
