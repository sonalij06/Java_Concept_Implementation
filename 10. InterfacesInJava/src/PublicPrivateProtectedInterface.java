public class PublicPrivateProtectedInterface implements inte_3 {
    public static void main(String[] args)
    {
        //object of implementing class
        PublicPrivateProtectedInterface in = new PublicPrivateProtectedInterface();
        //class implemented method
        in.helping();
        //public field of interface changed in class
        System.out.println(in.a);
        //class implemented method
        in.print();
    }
}
interface inte_3{
     public int a = 10;
     public int b = 101;
  //  protected int vari_1 = 100;
//    private int vari_2 = 900;

    /*
    Protected and private fields are not allowed in an interface.
     */


    default void print(){
        System.out.println("This is a Protected method.");
    }
    default void helping()
    {
        print();
    }
}