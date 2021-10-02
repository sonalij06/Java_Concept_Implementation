import java.util.Locale;

public class CaseChangeString {
    public static void main(String[] rgs)
    {
        //Variables
        String firstString = "SONALI JAIN";

        //toLowerCase() function converts string to lower Case
        System.out.println("String to Lower Case : " + firstString.toLowerCase());

        //Without using in - built function
        System.out.print("String to Lower Case without using in - built function : ");
        for(int  i = 0; i < firstString.length(); i++)
        {
            if(firstString.charAt(i) == ' ')
                System.out.print(' ');
            else
            System.out.print((char)(firstString.charAt(i)+32));
        }
    }
}
