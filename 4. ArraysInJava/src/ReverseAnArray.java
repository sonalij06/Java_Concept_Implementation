public class ReverseAnArray {
    public static void main(String[] args) {
        //Declaration and initialization of an array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Calculating length of the array
        int len = a.length;
        int t=0;
        //For - loop
        for (int i = 0; i < len/2; i++) {
             t = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] =  t;
        }
        //printing reversed array
        System.out.println("Reversed array : ");
        for (int i = 0; i < len; i++)
            System.out.print(a[i] + " ");
    }
}
