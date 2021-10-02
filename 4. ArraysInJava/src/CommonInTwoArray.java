public class CommonInTwoArray {
    public static void main(String[] args) {
        //Declaration and initialization of an array
        int[] a1 = {1, 2,4, 6, 5};
        //Calculating length of the array
        int len1 = a1.length;
        //Declaration and initialization of an array
        int[] a2 = {1, 2, 3, 3, 4, 6, 5};
        //Calculating length of the array
        int len2 = a2.length;
        //Traversing array for checking condition
        for (int  i = 0; i < len1; i++)
        {
            for(int  j = 0; j < len2; j++)
            {
                if(a1[i] == a2[j])
                    System.out.print(a1[i] + " ");
            }
        }
    }

}
