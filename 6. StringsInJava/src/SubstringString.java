import java.util.Scanner;

public class SubstringString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaring string variable
        String str = "findingsubstring";

        //without using substring method
        String helpString = "";
        for (int i = 0; i <= 3; i++)
            helpString += str.charAt(i);
        System.out.println("Substring without using substring method : " + helpString);

        //Using Substring method
        String help = str.substring(7, 16);
        System.out.println("Substring using substring method : " + help);
    }
}
