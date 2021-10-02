public class IncrementDecrement {
    public static void main(String[] args)
    {
        //Pre-Increment Operator
        int a=1;
        System.out.println("Variable : "+a);
        System.out.println("Variable : "+(++a));

        //Pre-Decrement Operator
        int b=10;
        System.out.println("Variable : "+b);
        System.out.println("Variable : "+(--b));

        //Post-Increment Operator
        int c=5;
        System.out.println("Variable : "+c);
        System.out.println("Variable : "+(c++));
        System.out.println("Variable : "+c);

        //Post-Decrement Operator
        int d=6;
        System.out.println("Variable : "+d);
        System.out.println("Variable : "+(d--));
        System.out.println("Variable : "+d);
    }
}
