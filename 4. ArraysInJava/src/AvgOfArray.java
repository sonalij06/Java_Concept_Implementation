public class AvgOfArray {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        //Calculating length of the array
        int len=a.length;
        //Variable to calculate average
        int avg = 0;
        //For-Loop to traverse array
        for(int i = 0; i < len; i++)
        {
            avg += a[i];
        }
        float d=(float)avg/len;
        System.out.println("Average of the given array : " + d);
    }
}
