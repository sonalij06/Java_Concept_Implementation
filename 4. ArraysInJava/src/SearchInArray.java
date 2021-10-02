public class SearchInArray {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        //Calculating length of the array
        int len=a.length;
        //Variable to search
        int k=7;
        System.out.print("Element found : " + search(a,k));
    }
    static boolean search(int a[], int k)
    {
        //For - Loop
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == k)
                return true;
        }
        return false;
    }
}
