public class ConstructorOfClass  {
    public static void main(String[] args)
    {
        //Calling default constructor
        Super s1 = new Super();
        //Calling one-parameterized constructor
        Super s2 = new Super(10);
        //Calling two-parameterized constructor
        Super s3 = new Super(100 , "sonali");
    }
}
//Another class
class Super
{
    //default constructor
    Super()
    {
        System.out.println("This is a default constructor.");
    }
    //one-parameterized constructor
    Super(int a)
    {
        System.out.println("This is a default constructor." + a);
    }
    //two-parameterized constructor
    Super(int b , String name)
    {
        System.out.println("This is a default constructor." + b + " " + name);
    }
}
