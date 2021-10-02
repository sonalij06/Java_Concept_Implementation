public class LogicalOperators {
    public static void main(String[] args) {

        //Variables
        int a=10,b=5;


        // AND ( && ) operator
        System.out.println((a > b) && (a > b));  // true
        System.out.println((a > b) && (a < b));  // false


        // OR ( || ) operator
        System.out.println((a < b) || (a > b));  // true
        System.out.println((a > b) || (a < b));  // true
        System.out.println((a < b) || (a < b));  // false


        // NOT ( ! ) operator
        System.out.println(!(a == b));  // true
        System.out.println(!(a > b));  // false
    }
}
