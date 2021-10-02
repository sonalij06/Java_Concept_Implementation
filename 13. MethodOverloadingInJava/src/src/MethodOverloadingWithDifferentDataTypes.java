public class MethodOverloadingWithDifferentDataTypes {
    public static void main(String[] args)
    {
        //Object of class
        MethodOverloadingWithDifferentDataTypes m = new MethodOverloadingWithDifferentDataTypes();
        //Calling first method
        m.method_4(4);
        //Calling overloaded method
        m.method_4("sonali");
    }
    //First method
    void method_4(int a)
    {
        System.out.println("First method : " + a);
    }
    //Overloaded method
    void method_4(String name)
    {
        System.out.println("Second method : " + name);
    }
}
