public class MethodsInMain {
    public static void main(String[] args)
    {
        //object of class
        MethodsInMain m = new MethodsInMain();
        staticMethod();
        m.InstanceMethod();
    }
    //Static method
    public static void staticMethod()
    {
        System.out.println("This is a Static Method");
    }
    //Instance Method
    public void InstanceMethod()
    {
        System.out.println("This is a Instance Method");
    }
}
