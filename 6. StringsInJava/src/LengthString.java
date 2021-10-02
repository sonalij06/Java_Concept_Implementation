import java.util.Scanner;

public class LengthString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Declaring string variable
        String str = "findLength";

        int i = 0;
        char ch[] = str.toCharArray();
        //finding length using for - each loop
        for(char ch1 : ch)
            i++;
        System.out.println("Finding length using for - each loop : " + i);

        //finding length using length() function
        int length = str.length();
        System.out.println("Using Length() function : " + length);
    }
}
