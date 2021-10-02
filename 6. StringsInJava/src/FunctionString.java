public class FunctionString {
    public static void main(String[] args)
    {
        //Variables
        String str1 = "sonali";
        String str2 = "SONALI";

        //equalsIgnoreCase() function compare string ignoring cases
        System.out.println(str1.equalsIgnoreCase(str2));//true

        //startsWith() function check whether the string starts with second string
        System.out.println(str1.startsWith("SONA"));//false

        //endsWith() function check whether the string ends with second string
        System.out.println(str2.endsWith("ali"));//false

        //compareTo() function return difference of ascii code of first dissimilar character
        System.out.println(str1.compareTo(str2));//false
    }
}
