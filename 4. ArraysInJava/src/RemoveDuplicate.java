public class RemoveDuplicate {
    public static void main(String[] args)
    {
    //Declaration and initialization of an array
    int[] a = {1, 1, 2, 3, 2, 3, 4, 6, 5};
    //Calculating length of the array
    int len = a.length;
    len=remove(a,len);
    System.out.println("Array after removing duplicate elements : ");
    for(int i = 0; i < len; i++)
        System.out.print(a[i] + " ");
}
    public static int remove(int a[], int len){
        if (len==0 || len==1){
            return len;
        }
        int[] ab = new int[len];
        int j = 0;
        for (int i = 0; i < len-1; i++){
            if (a[i] != a[i+1]){
                ab[j++] = a[i];
            }
        }
        ab[j++] = a[len-1];
        // Changing original array
        for (int i=0; i<j; i++){
            a[i] = ab[i];
        }
        return j;
    }
}
