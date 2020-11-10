package Day9_IfStatement;

public class ElseIfStatement_Vote {
    public static void main(String[] args) {

        int age = 8;
        boolean usCitizen = true;

        if ( age >= 18 && usCitizen){
            System.out.println("Is eligible to vote for Trump");
        }else{
            System.out.println("Isn't eligible to vote for Trump");
        }

    }
}
