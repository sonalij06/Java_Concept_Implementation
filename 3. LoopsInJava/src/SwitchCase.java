public class SwitchCase {
    public static void main(String[] args)
    {
        //Variables
        int num = 13;
        switch(num % 2)
        {
            case 0:
            {
                System.out.println("Even");
                break;
            }
            case 1:
            {
                System.out.println("Odd");
                break;
            }
        }
    }
}
