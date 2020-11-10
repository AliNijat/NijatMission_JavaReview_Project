package Day11_NestedIf_Ternary;

public class NedtedIf_Practice {
    public static void main(String[] args) {

        double salary = 120000;
        int jobHistory = 5;

        if (salary >= 30000){
            if (jobHistory >=5){
                System.out.println("You are qualified");
            }else {
                System.out.println("you most have been on job at least 2 years");
            }
        }else {
            System.out.println("You most to earn at least $30K");
        }

    }
}
