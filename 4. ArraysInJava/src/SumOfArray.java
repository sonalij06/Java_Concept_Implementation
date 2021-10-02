public class SumOfArray {
    public static void main(String[] args)
    {
        //Variables
        //Array Declaration and Initialization
        int[] a={1,2,3,4,5,6,7};
        //Calculating Length of an array
        int len=a.length;
        //Variable to store sum
        int sum=0;
        //for- loop to traverse an array
        for(int i = 0; i < len; i++)
        {
            sum+=a[i];
        }
        //Printing  sum of an array
        System.out.println("Sum of the given array : " + sum);

    }
}
