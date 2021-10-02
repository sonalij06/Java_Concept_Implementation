public class AccessModifierOfConstructor {
    public static void main(String[] args)
    {
        //Calling Default constructor
        AccessModifierOfConstructor a1 = new AccessModifierOfConstructor();
        //Calling Private constructor
        AccessModifierOfConstructor a2 = new AccessModifierOfConstructor(1);
        //Calling Protected constructor
        AccessModifierOfConstructor a3 = new AccessModifierOfConstructor(1,2);
        //Calling Public constructor
        AccessModifierOfConstructor a4 = new AccessModifierOfConstructor(1,2,3);
    }
    //Default constructor
    AccessModifierOfConstructor()
    {
        System.out.println("Default constructor");
    }
    //Private constructor
    private AccessModifierOfConstructor(int a)
    {
        System.out.println("Private constructor");
    }
    //Protected constructor
    protected AccessModifierOfConstructor(int a, int b)
    {
        System.out.println("Protected constructor");
    }
    //Public constructor
    public AccessModifierOfConstructor(int a,int b, int c)
    {
        System.out.println("Public constructor");
    }
}
