package Day8_LogicalOperators;

public class Logical {
    public static void main(String[] args) {
        // !: opposite boolean
        boolean r1 = 9 > 7;
        boolean r2 = !r1;

        System.out.println(r1 + " : " + r2);
        System.out.println(!false);
        System.out.println(!true);

        boolean r3 = !false == true;
        boolean r4 = true == !true;

        System.out.println(r3);
        System.out.println(r4);




    }
}
