public class CopyAnArray {
    public static void main(String[] args)
    {
        //Declaration and initialization of an array
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        //Calculating length of the array
        int len=a.length;
        //Creating another to store previous array
        int[] b=new int[len];
        //For - loop
        for(int i = 0; i < len; i++)
            b[i]=a[i];
        //Printing first array
        System.out.print("First array : ");
        for(int i = 0; i < len; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        //Printing second array
        System.out.print("Second array : ");
        for(int  i = 0; i < len; i++)
            System.out.print(b[i] + " ");
    }
}
