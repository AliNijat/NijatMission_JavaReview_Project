package Day8_LogicalOperators;

public class OrAnd {
    // || or : either
    // && and: both
    public static void main(String[] args) {
        String firstName = "Mohammad Ali";
        String lastName = "Ali Nijat";
        int age = 19;
        String  citizenShip = "USA";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";

        String fullName = firstName + " " +lastName;
        System.out.println(fullName + " is elegible to vote: " +  eligibleToVote);

        boolean result = 4 >= 8 && 8 == 9;
        boolean result1 = !false && true;
        boolean result2 = true && 342 < 34789;
        System.out.println(result +"\t" + result1 + "\t" + result2);
    }
}
