public class InterfaceInherit {
    public static void main(String[] args)
    {
        //object of implementing class
        implemented3 im = new implemented3();
        //Calling method of super interface
        im.method_1();
        //Calling method of sub interface
        im.method_2();
    }
}
//class which implements interface
class implemented3 implements inter_2
{
    //implementation of method of superinterface
    public void method_1()
{
    System.out.println("Method of super interface.");
}
//implementation of method of sub interface
public void method_2()
    {
        System.out.println("Method of sub interface.");
    }
}
//super interface
interface inter_1{
void method_1();
}
//sub interface
interface inter_2 extends inter_1
{
void method_2();
}