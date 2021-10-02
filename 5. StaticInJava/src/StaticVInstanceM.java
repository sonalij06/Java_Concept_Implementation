public class StaticVInstanceM {
    //Static Variable
    static int a = 1000;
    public static void main(String[] args)
    {
        //object of class
        StaticVInstanceM i = new StaticVInstanceM();
        //calling instance method using object
        i.InstanceMethod();
    }
    //Instance method
    public  void InstanceMethod()
    {
        System.out.println("Instance Variable : " + a);
    }
}
