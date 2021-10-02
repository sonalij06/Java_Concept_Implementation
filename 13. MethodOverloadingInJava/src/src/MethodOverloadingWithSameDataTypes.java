public class MethodOverloadingWithSameDataTypes {
    public static void main(String[] args)
    {
        //Object of class
        MethodOverloadingWithSameDataTypes m = new MethodOverloadingWithSameDataTypes();
        //Calling first method
        m.method_1(5);
        //Calling second method by method overloading
        m.method_1(5,6);
    }
    //First method
    void method_1(int a)
    {
        System.out.println("One parameter method : " + a);
    }
    //Second method of same name but different number of parameter of same data types
    void method_1(int b ,int c)
    {
        System.out.println("Two parameter method : " + b + " " + c);
    }
}
