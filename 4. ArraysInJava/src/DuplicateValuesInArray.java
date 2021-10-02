public class DuplicateValuesInArray {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1,1,2,3,2,3,4,6,5};
        //Calculating length of the array
        int len=a.length;
        //Traversing the array
        for(int i = 0; i < len-1; i++)
        {
            for(int j = i+1; j < len; j++)
            {
                if(a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
