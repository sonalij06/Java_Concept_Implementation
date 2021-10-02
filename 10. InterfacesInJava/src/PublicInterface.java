public class PublicInterface {
    public static void main(String[] args)
    {
        //object of implementing class
        Implement3 im = new Implement3();
        //class implemented method
        im.show();
        //default method of interface
        im.display();
        //public field of interface changed in class
        System.out.println("Variable in class" + im.vari);
        //public field of interface
        System.out.println(inte_1.vari);
    }
}
//implementing class of interface
class Implement3 implements inte_1
{
    public int vari = 90;
public void show()
{
    System.out.println("This is a show method.");
}
}
