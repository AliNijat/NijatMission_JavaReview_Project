package Day11_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num = 101;       // We can use Ternary only for same data type out-put not different data type

        String result = num %2 == 0 ? "Even" : "Odd";   // I used ternary instead of if statement
        System.out.println(result);
        System.out.println("---------------------");

        String result2 = "";
        if (num %2 == 0 ){
            result2 = "Even";
        }else {
            result2 = "Odd";
        }
        System.out.println(result2);
    }
}
