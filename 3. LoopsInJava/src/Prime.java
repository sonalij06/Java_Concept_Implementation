public class Prime {
    public static void main(String[] args)
    {
        //Variables
        int num=7;
        Boolean flag = false;
        //For - loop
        for(int i = 2;i < num; i++)
        {
            if(num % i == 0)
                flag = true;
        }
        if(flag == true)
            System.out.println("Number is not a prime number.");
        else
            System.out.println("Number is a prime number.");
    }
}
