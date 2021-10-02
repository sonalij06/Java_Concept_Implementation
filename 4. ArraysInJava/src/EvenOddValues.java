public class EvenOddValues {
    public static void main(String[] args) {
        //Declaration and initialization of an array
        int[] a = {1, 2, 3, 2, 3, 4, 6, 5};
        //Calculating length of the array
        int len = a.length;
        //counter variables
        int odd = 0;
        int even = 0;
        //for - loop to traverse array
        for (int i = 0; i < len; i++) {
            if (a[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of Even elements : " + even);
        System.out.println("Number of Odd elements : " + odd);
    }
}
