public class VariablesInJava {
    public static void main(String[] args)
    {
        //Creating Reference Variable of Class
        Variables v=new Variables();

        //Global Variable can printed using class name ( without reference variable )
        System.out.println("Value of a : "+Variables.a);

        //Local Variable cannot be printed without reference variable
        System.out.println("Local Variable : "+v.c);

        //add() function prints sum of global variable
        System.out.println("Sum of Global Variables : "+v.add());

        //localadd() function prints sum of local variables
        System.out.println("Sum of Local Variables : "+v.localadd());

        //display() function prints local variable
        v.display();

        //globalDisplay() function prints global variable
        v.globalDisplay();

        /*
        Scope
        Global Variable : Outside all the functions
        Local Variable : Within a function block
         */

    }
}
class Variables
{
    //Global variable declaration
    static int a=10;
    int b=100;

    //Local Variable with different name as Global variable name
    int c=67;

    int add() {
        return a + b;
    }

    int localadd()
    {
        //Local variable with same name as Global variable
        int a=100;
        int b=200;
        return a+b;
    }

    void display()
    {
        //local variables
        int a=190;
        System.out.println("Value of local variable a : "+a);
    }

    void globalDisplay() {
        //global variables
        System.out.println("Value of Global Value : "+a+" , "+b);
    }
}
