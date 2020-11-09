package Day6_ComparisonOperators;

public class Implicit_Explicit {

    public static void main(String[] args) {

        // Implicit ==>> Casting smaller primitive to larger and it will does by automatically
        byte  b1 = 127;
        short s1 = b1;
        int   i1 = s1;
        long  l1 = i1;
        float f1 = l1;

        double d1 = f1;
        double d2 = d1;

        // Explicit ==>> Casting the larger primitive to the smaller primitive and we need to do it manually by putting (datatype)
        float f2 = (long) d1; // and we put int, short, byte and float
        long  l2 = (int) f2;  // and we put int, short, byte and long
        int   i2 = (short) l2;// and we put int, short and byte
        short s2 = (byte) i2; // and we put short, and byte
        byte b2 = (byte) s2;  // and we put only byte

        System.out.println( l1);
        System.out.println( l2);

        System.out.println(d1);
        System.out.println(d2);

    }
}
