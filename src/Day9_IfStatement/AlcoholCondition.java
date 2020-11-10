package Day9_IfStatement;

public class AlcoholCondition {
    public static void main(String[] args) {

        boolean hasID = true;
        int age = 30;

        boolean eligible = hasID && age >=21;
        String result = "";

        if (eligible){
           // System.out.println("Is eligible to buy alcohol: " +eligible);
            result = "Is eligible to buy alcohol";
        }

        if (eligible == false){
           //System.out.println("Go buy your milk: " +eligible);
            result = "Is eligible to buy milk";
        }
        System.out.println(result);

    }
}
