public class Runtime_Polymorphism {
    public static void main(String[] args)
    {
        //object of class A
        AA a1 = new AA();//100
        AA a2 = new BB();//100
        AA a3 = new CC();//100

        //object of class B
        //BB b1 = new AA(); subclass can't call constructor of superclass
        BB b2 = new BB();//10
        BB b3 = new CC();//10

        //object of class C
        //CC c1 = new AA(); subclass can't call constructor of superclass
        //CC c2 = new BB(); subclass can't call constructor of superclass
        CC c3 = new CC();//123

        //Calling function of class A
        System.out.println(a1.variable);
        System.out.println(a2.variable);
        System.out.println(a3.variable);

        //Calling function of class B
        System.out.println(b2.variable);
        System.out.println(b3.variable);

        //Calling function of class C
        System.out.println(c3.variable);

    }
}
class AA{
    //same variable as subclass
    int variable = 100;
}
class BB extends AA{
    //same variable as superclass
    int variable = 10;
}
class CC extends BB{
    //same variable as superclass
    int variable = 123;
}
