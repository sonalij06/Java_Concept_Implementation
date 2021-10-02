public class SuperKeyword  {
    int a = 100;

    public static void main(String[] args) {

        //object of superclass
        Subclass sup = new Subclass();
        //Method of class
        sup.display();
    }
}
    class Subclass extends Superclass{
    //Method
    void display()
    {
        //Calling superclass method using super keyword
        System.out.println(super.a);
    }

}
//Parent class
class Superclass
{
     int a = 10;
}
