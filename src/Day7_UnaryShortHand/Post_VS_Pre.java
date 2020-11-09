package Day7_UnaryShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a);  // 11
        System.out.println(--a);  // 10
        System.out.println("-----------------");
        System.out.println(a++);  // 10
        System.out.println(a);    // 11
        System.out.println("-----------------");
        System.out.println(a--);  // 11
        System.out.println(a);    // 10
    }
}
