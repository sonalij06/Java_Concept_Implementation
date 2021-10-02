public class IndexOfElement {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        //Calculating length of the array
        int len=a.length;
        //Variable to return index of
        int k=7;
        //For-Loop to traverse array
        for(int i = 0; i < len; i++)
        {
           if(a[i] == k)
           {
               System.out.println("Index of " + k + " is : " + i);
               break;
           }
        }
    }
}
