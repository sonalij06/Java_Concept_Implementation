public class InsertionAtPosition {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Calculating length of the array
        int len = a.length;
        //Inserting Variable
        int insert = 100;
        //Position at which the element should be inserted
        int index = 5;
        int[] ab=new int[len+1];

        //Inserting element
        for(int i = len; i >= index; i--)
        {
            ab[i] = a[i-1];
        }
        for(int i = 0; i < index-1; i++)
            ab[i] = a[i];
        ab[index-1] = insert;

        //Printing Array after insertion
        System.out.println("Array after insertion : ");
        for (int i = 0; i <= len; i++)
            System.out.print(ab[i] + " ");
    }
}
