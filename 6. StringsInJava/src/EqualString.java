import java.util.Scanner;

public class EqualString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaring string variable
        String str1 = "Equal";
        String str2 = "equal";
        String str3 = "Equal";

        //Variables for storing answer
        boolean check1 ,check2;
        check1 = str1.equals(str2);//false
        check2 = str1.equals(str3);//true


        System.out.println(check1);
        System.out.println(check2);

    }
}
