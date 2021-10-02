public class CreatingString {
    public static void main(String[] args)
    {
        //Creating string by character array
        char[] ch = {'a','b','c','d','e','f','g','h'};
        System.out.print("String using character array : ");
        for(int i = 0; i < ch.length; i++)
        System.out.print(ch[i]);

        System.out.println();
        //Creating string by using String literal
        String str = "abcdefgh";
        System.out.println("Using literals : " + str);

        //Creating string using new Keyword
        String str1 = new String("JavaStrings");
        System.out.println("Using new Keyword : " + str1);

    }
}
