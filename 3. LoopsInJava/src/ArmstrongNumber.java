public class ArmstrongNumber {
    public static void main(String[] args)
    {
        //Variables
        int num = 153;
        int c = 0;
        int n = num;
        //While - loop for counting number of digits
        while(n != 0)
        {
            n /= 10;
            c++;
        }
        int sum = 0;
        int m = num;
        //Calculating sum of digits
        while(m != 0)
        {
            sum += Math.pow(m % 10,c);
            m /= 10;
        }
        //Checking whether number is armstrong or not
        if(sum == num)
            System.out.println("Number is Armstrong Number.");
        else
            System.out.println("Number is not Armstrong Number.");

    }
}
