public class OddEven {
    public static void main(String[] args)
    {
        //Variables
        int i = 0;
        //For-loop
        System.out.println("Even Numbers : ");
        //Calculating Even numbers
        for( i = 0;i < 11; i++)
        {
            if(i%2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Odd Number : ");
        //Calculating Odd numbers
        for( i = 0;i < 11; i++)
        {
            if(i%2 != 0)
                System.out.print(i + " ");
        }
    }
}
