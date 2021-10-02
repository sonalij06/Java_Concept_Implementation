public class SuperConstructor extends ParentClass{
    public static void main(String[] args)
    {
        //Object of Parent class
        ParentClass pa =new SuperConstructor();

    }
    SuperConstructor()
    {
        //Calling super class constructor using super
        super();
    }
}
class ParentClass{
    //Parent class constructor
    ParentClass()
    {
        System.out.println("This is a default constructor.");
    }
}