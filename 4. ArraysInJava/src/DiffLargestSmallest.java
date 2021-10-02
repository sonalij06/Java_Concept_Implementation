import java.util.Arrays;

public class DiffLargestSmallest {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1, 2, 3, 2, 3, 4, 6, 5};
        //Calculating length of the array
        int len = a.length;
        //In - built function to sort array
        Arrays.sort(a);
        System.out.println("Difference of Largest and Smallest elements are : " + (a[len-1]-a[0]));
    }
}
