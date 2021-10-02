public class ClassObjectMethod {
    public static void main(String[] args)
    {
        //Creation of object of class
        Call c=new Call();
        //Calling method of another class
        c.display();
    }
}
//Another class
class Call
{
    String st="Print the message";
    void display()
    {
        System.out.println(st);
    }
}