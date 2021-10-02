public class Methodoverloading {
    public static void main(String[] args)
    {
        //Object of class
        Methodoverloading m = new Methodoverloading();
        //Calling first method
        m.method_2(4);
        //Calling second method by overloading
        m.method_2(5 , "sonali");
    }
    //First method
    void method_2(int a)
    {
        System.out.println("Method with one parameter : " + a);
    }
    //Second method of same name but different number of parameter of different data types
    void method_2(int b,String name)
    {
        System.out.println("Method with two parameter : " + b + " " + name);
    }
}
