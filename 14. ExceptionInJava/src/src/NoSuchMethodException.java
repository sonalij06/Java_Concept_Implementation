public class NoSuchMethodException {
    public static void main(String[] args)
    {
        try{
//            HelloWorld.class.getDeclaredField(methodName());
            //uncommenting the commented statement shows the exception
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
