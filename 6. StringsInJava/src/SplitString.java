public class SplitString {
    public static void main(String[] args)
    {
        //Variables
        String firstString = "My name is sonali jain";

        //split() function divides string from given character
        System.out.println("String after splitting : ");
        String[] splitedString = firstString.split("a");
        for(String a : splitedString)
        System.out.println(a);
    }
}
