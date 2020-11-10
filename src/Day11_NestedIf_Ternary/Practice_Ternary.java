package Day11_NestedIf_Ternary;

public class Practice_Ternary {
    public static void main(String[] args) {

        int age = 20;
        boolean eligible = false;

        if (age >= 21){
            eligible = true;

        }else {
            eligible = false;
        }
        System.out.println(eligible);
        System.out.println("--------------------");

        // by ternary
        String eligible2 = age >= 21? "True": "false";
        System.out.println(eligible2);
        System.out.println();

        // Another task
        String voteEligible = age >= 18 ? "You can vote!" : " you can not vote!";
        System.out.println(voteEligible);
        System.out.println("-----------------------------------------------------");

        // Another task by ternary
        int ageForVote = 23;
        String citizen = "USA";

        String result = "";
        if (ageForVote >= 21 && citizen == "USA"){
            result = "Can vote";
        }else {
            result = "Can't vote";
        }
        System.out.println(result);
        String r = ageForVote >= 21 ? "Sure! can vote" : "can not vote";
        System.out.println(r);
        System.out.println("------------------------------------");

        int num = -12;
        String result2 = "";

        if(num > 0){
            result2 = "Positive";
        } else if(num < 0){
            result2 = "Negative";
        }else{
            result2 = "Zero";
        }
        System.out.println(result2);
        String resultOf2 = num > 0 ? "Positive" : num < 0 ? "Negative" : "Zero";
        System.out.println(result2);
        System.out.println("------------------------------");

        // Do this task by ternary
       int  a = 40, b = 30;
       String Greater = (a > b) ? a+ " is greater than "+b : (b > a) ? b+ " " +
                                      "is greater than "+ a : a+ " is equal to " +b;
        System.out.println(Greater);

    }
}
