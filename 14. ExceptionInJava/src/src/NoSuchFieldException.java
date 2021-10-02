public class NoSuchFieldException {
    public static void main(String[] args)
    {
        try{
//            HelloWorld.class.getDeclaredField(propertyName);
            //uncommenting the commented statement shows the exception
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class HelloWorld
{

}
