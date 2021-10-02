import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] rags)
    {
        Scanner sc = new Scanner(System.in);
        //Declaration and initialization of an array
        int[] a = new int[10];
        //Calculating length of the array
        int len=10;
        //Variable to calculate sum
        int j = 1;
        System.out.println("Enter elements to array : ");
        for(int  i = 0; i < len; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < len; i++)
        {
            if(a[i] != j)
            {
                System.out.println("Missing number between 1 to 100 is : " + j);
            break;
            }
            j++;
        }

    }
}
