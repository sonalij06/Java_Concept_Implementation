public class VariablesInMain {
    //Static variables
    static int a = 10;
    static int b = 20;
    //Instance Variables
    int c = 100;
    int d = 200;
    public static void main(String[] args)
    {
        //object of class
        VariablesInMain v = new VariablesInMain();


        //calling static variables in main
        System.out.println("Static variable a : " + a);
        System.out.println("Static variable b : " + b);


        //calling instance variables in main using object
        System.out.println("Instance variable c : " + v.c);
        System.out.println("Instance variable d : " + v.d);
    }
}
