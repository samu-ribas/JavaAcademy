package academy.introduction;

/**
 * This is a <b>Javadoc</b> comment
 */
public class PrimitiveDataTypes {
    public static void main(String[] args){
        // int, double, float, char, byte, boolean, short, long
        int age = 23;
        long bigNumber = (long) 155.56;
        double doubleNumber = 2000.31D;
        float floatNumber = (float) 1.3D;
        byte byteAge = 127;
        short shortAge = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = '\u0041';
        String name = "goku";

        System.out.println("My age is " +age+ " years old");
        System.out.println(falso);
        System.out.println("char " +character);
        System.out.println(bigNumber);
        System.out.println("Hi, my name is "+name);
    }
}
