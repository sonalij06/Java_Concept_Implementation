public class MethodOverloadingWithReturnType {
    public static void main(String[] args)
    {
        //Object of class
        MethodOverloadingWithReturnType m = new MethodOverloadingWithReturnType();
        //Calling first method
        m.method_5(4);
        //Calling overloaded method
        m.method_5(5);

    }
    void method_5(int a)
    {
        System.out.println("First method : " + a);
    }
    //Overloaded method
//    int method_5(int name)
//    {
//        return name;
//    }
    //Method cannot be overloaded with different return type
}
