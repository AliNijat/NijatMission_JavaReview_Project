package Day8_LogicalOperators;

public class OrAnd_Practice {
    public static void main(String[] args) {
        // || or : either
        // && and: both

        int age = 12;
        String citizen1 = "USA";
        String citizen2 = "France";

        boolean eligibleAge = age >= 18;
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
    }
}
