public class DataTypesInJava {
    public static void main(String[] args)
    {

        /*
        byte :  is an 8-bit signed two’s complement integer
        Size : 1 byte ( 8-bits )
        Default value : 0
        Range : -128 to 127
         */
        byte b=10;
        System.out.println("byte DataType : "+b);


        /*
        int : is a 32-bit signed two’s complement integer.
        Size : 4 bytes ( 32-bits )
        Default value : 0
        Range : 0 - 2^32-1
         */
        int i=10;
        System.out.println("int DataType : "+i);


        /*
        short :  is a 16-bit signed two’s complement integer.
        Size : 2 bytes ( 16 bits )
        Default value : 0
        Range : -32,768 - 32,767
         */
        short s=10;
        System.out.println("short DataType : "+s);


        /*
        double :  is a double-precision 64-bit IEEE 754 floating-point.
        Size : 8 bytes ( 64 bits )
        Default value : 0.0
        Range : upto 16 decimal digits
         */
        double d=10.0d;
        System.out.println("double DataType : "+d);


        /*
        float : is a single-precision 32-bit IEEE 754 floating-point.
        Size : 4 bytes ( 32 bits )
        Default value : 0.0
        Range : upto 7 decimal digits
         */
        float f=10.0f;
        System.out.println("float DataType : "+f);


        /*
        long : is a 64-bit two’s complement integer.
        Size : 8 bytes ( 64 - bits )
        Default value : 0
        Range : 0 - 2^64-1
         */
        long l=10;
        System.out.println("long DataType  : "+l);


        /*
        char : is a single 16-bit Unicode character.
        Size : 2 bytes ( 16 bits )
        Default value : '\u0000'
        Range : 0 - 65535
         */
        char c='a';
        System.out.println("char DataType : "+c);


        /*
        boolean : only one bit of information either true or false
        Size : virtual machine dependent
        Default value : false
        Range : true and false
         */
        boolean bool=true;
        System.out.println("boolean DataType : "+bool);
    }
}
