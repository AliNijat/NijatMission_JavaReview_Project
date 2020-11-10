package Day11_NestedIf_Ternary;

public class DaysInMonth {
    public static void main(String[] args) {

        int month = 5;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 12;

        boolean inValid = month <= 0 || month >= 12;

        String result = "";
        if (days28){
            result = "28 days";
        }else if (days30){
            result = "30 days";
        }else if (inValid){
            result = "Invalid";
        }else {
            result = "31 days";
        }
        System.out.println(result);
    }
}
