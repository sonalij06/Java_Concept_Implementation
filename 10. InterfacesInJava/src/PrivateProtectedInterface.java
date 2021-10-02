public class PrivateProtectedInterface implements inte_2{
    public static void main(String[] args)
    {
        //object of implementing class
        PrivateProtectedInterface in = new PrivateProtectedInterface();
        //class implemented method
        in.helping();
        //public field of interface changed in class
        System.out.println(in.vari_1);
        //class implemented method
        in.print();
    }

    @Override
    public void print() {
        System.out.println("Method.");
    }
}
   interface inte_2
{
//    protected int vari_1 = 100;
//    private int vari_2 = 900;

    /*
    Protected and private fields are not allowed in an interface.
     */
    static int vari_1 = 100;
    static int vari_2 = 900;
    default void print(){
        System.out.println("This is a Protected method.");
    }
    default void helping()
    {
        print();
    }

}
