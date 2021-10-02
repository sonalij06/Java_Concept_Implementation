public class ArrayContains {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1,12,23,4,5,6,7,8,9,10};
        //Calculating length of the array
        int len=a.length;
        if(check(a, 12,23))
            System.out.println("Array contains both the integers.");
        else
            System.out.println("Array does contains both the integers.");
    }
    static boolean check(int a[], int n1, int n2)
    {
        boolean f1 = false, f2 = false;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == n1)
                f1 = true;
            else if(a[i] == n2)
                f2 = true;
        }
        if(f1 && f2)
            return true;
        return false;
    }
}
