public class MultipleIfElse {
    public static void main(String[] args)
    {
        //Variables
        int x = 10,y = 20,z = 30;
        if(x > y)
        {
            if(x > z)
                System.out.println("Largest Number is x : " + x);
            else
                System.out.println("Largest Number is z : " + z);
        }
        else {
            if(y > z)
            System.out.println("Largest Number is y : " + y);
            else
                System.out.println("Largest Number is z : " + z);
        }
    }
}
