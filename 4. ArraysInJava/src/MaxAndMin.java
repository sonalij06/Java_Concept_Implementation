public class MaxAndMin {
    public static void main(String[] args) {
        //Declaration and initialization of an array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Calculating length of the array
        int len = a.length;
        //Variables to store maximum and minimum
        int max = a[0];
        int min = a[0];
        //For - loop
        for(int i = 0; i < len; i++) {
            if(a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];
        }
        System.out.println("Maximum value in array : " + max + "\nMinimum Value in array : " + min);
    }
}
