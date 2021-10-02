public class Default_Modifier {
    //Default modifier variable
    int one = 1;

    //Default modifier method
    void printing_Method()
    {
        System.out.println("This is a Default access Modifier Method.");
    }

    public static void main(String[] args)
    {
        //object of subclass
        AA a = new AA();

        //Variable of subclass
        System.out.println("Default modifier of subclass : " + a.second);

        //Method of subclass
        a.Method_subclass();
    }
}
//subclass
class AA extends Default_Modifier
{
    //Default access modifier Variable
    int second = 2;

    //Default access modifier method of subclass
    void Method_subclass()
    {
        System.out.println("This is Default access modifier of subclass.");
    }
}
