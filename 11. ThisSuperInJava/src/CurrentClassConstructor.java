public class CurrentClassConstructor {
    //Default constructor
    CurrentClassConstructor()
    {

        System.out.println("This is a default constructor.");
    }
    public static void main(String[] args)
    {
        //Object of class
        CurrentClassConstructor cc = new CurrentClassConstructor(6);
        //Default constructor without using this keyword
//        new CurrentClassConstructor();
    }
    CurrentClassConstructor(int a)
    {
        //Default constructor with using this keyword
        this();
    }

}
