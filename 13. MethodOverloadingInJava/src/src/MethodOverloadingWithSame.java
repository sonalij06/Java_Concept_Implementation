public class MethodOverloadingWithSame {
    public static void main(String[] args)
    {
        //Object of class
        MethodOverloadingWithSame m = new MethodOverloadingWithSame();

        //Calling method
        m.method_3(4,"sonali");
        m.method_3("jain",6);
    }
    //Method body
    void method_3(int a, String b)
    {
        System.out.println("First method : " + a + " " + b);
    }
    void method_3(String c , int d)
    {
        System.out.println("First method : " + c + " " + d);
    }

}
