import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1, 2, 3, 2, 3, 4, 6, 5};
        //Calculating length of the array
        int len = a.length;
        //sorting in - build function to sort array
        Arrays.sort(a);
        System.out.println("Second smallest element of array : " + a[1]);
    }
}
