public class StringObject {
    public static void main(String[] args) {
        //Declaring Integer object Variable
        Integer in=10;

        //Converting Integer to string using toString() function
        String st1=in.toString();

        //Converting Integer to string using double - quotes ""
        String st2=""+in;

        //printing strings
        System.out.println(in+" "+st1+" "+st2);
    }
}
