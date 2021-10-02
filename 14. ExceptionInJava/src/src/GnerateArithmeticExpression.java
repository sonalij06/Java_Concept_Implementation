public class GnerateArithmeticExpression {
    public static void main(String[] args)
    {
        try{
            int a = 5 / 0;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
