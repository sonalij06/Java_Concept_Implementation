public class InstanceVStaticM {
    //Instance Variable
    int a = 10;
    public static void main(String[] args)
    {
        //Calling of static method in main
        StaticMethod();
    }
    //Static Method
    public static void StaticMethod()
    {
        //Object of class
        InstanceVStaticM i = new InstanceVStaticM();
        //calling instance variable using object
        System.out.println("Instance Variable : " + i.a);
    }
}
