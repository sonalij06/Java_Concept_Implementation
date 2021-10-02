public class CurrentClassThis {
    public static void main(String[] args)
    {
        //Object of class
        Class_1 c = new Class_1(10, "sonali");

        //Method of object class
        c.print();
    }
}
class Class_1
{
    //Variables
    int a;
    String name;

    //Parametrized Constructor
    Class_1(int a, String name)
    {
        //using this to specify variable of current class
        this.a = a;
        this.name = name;
    }

    //Printing variables of class
    void print()
    {
        System.out.println("a = " + a);
        System.out.println("Name = " + name);
    }
}
