public class SuperToClass extends Superclass{
    public static void main(String[] args)
    {
        //Calling default constructor
        Superclass s1 = new Superclass();
        //Calling parameterized constructor
        Superclass s2 = new Superclass(5);
    }
}
//superclass
class Superclass
{
    //default constructor
    Superclass()
    {
        System.out.println("This is a default constructor.");
    }
    //parameterized constructor
    Superclass(int a)
    {
        System.out.println("This is a parametrized constructor.");
    }
}
