public class RemoveInArray {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        //Calculating length of the array
        int len=a.length;
        //Variable to remove
        int k=7;
        //For - loop
        for(int i = 0;i < len; i++)
        {
            if(a[i] == k) {
                for (int j = i; j < len-1; j++)
                    a[j] = a[j + 1];
                len--;
                break;
            }
        }
        //Printing array after removing the element
        for(int i = 0; i < len; i++)
            System.out.print(a[i] + " ");
    }
}
