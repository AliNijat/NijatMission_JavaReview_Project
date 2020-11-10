package Day8_LogicalOperators;

public class Practice {
    public static void main(String[] args) {

        int b = 2;
        boolean res = b++ == 2 || --b ==2;
        boolean ress = ++b == 2 || b-- ==2;

        System.out.println(res);
        System.out.println(b);
        System.out.println(ress);

        int c = 5;
        boolean r2 = c++ == 6 || c-- ==5;

        System.out.println("----------------");
        System.out.println(r2);
        System.out.println(c);

        boolean x = true, z = true;
        int y = 20;
        //x =(y);

    }
}
