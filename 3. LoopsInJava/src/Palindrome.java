public class Palindrome {
    public static void main(String[] args)
    {
        //Variables
        int num = 122;
        int reverse = 0;
        //while - loop
        int n = num;
        while(n != 0)
        {
            reverse = reverse * 10 + (n % 10);
            n /= 10;
        }
        if(reverse == num)
            System.out.println("Number is palindrome Number.");
        else
            System.out.println("Number is not palindrome Number.");
    }
}
