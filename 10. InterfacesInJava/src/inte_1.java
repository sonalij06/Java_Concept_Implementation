//interface
public interface inte_1 {
    //public field of interface
    public int vari = 100;

    //default method
    public default void display() {
        System.out.println("This is a display method.");
    }

    void show();
}
