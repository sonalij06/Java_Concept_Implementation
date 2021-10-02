import java.util.Scanner;

public class ConcatenationString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //Declaring two string variables
        String first = "Sonali";
        String second = "Jain";
        //Concatenating using '+' operator
        String combine = first + " " + second;
        System.out.println("Strings after concatenating : " + combine);
    }
}
