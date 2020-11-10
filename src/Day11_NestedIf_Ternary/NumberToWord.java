package Day11_NestedIf_Ternary;

public class NumberToWord {
    public static void main(String[] args) {
        int number = 9;
        String result = "";

        if (number == 0){
            result = "Zero";
        }else if (number == 1 ){
            result = "Two";

        } else if (number == 3){
            result = "Three";
        }else if (number == 4){
            result = "Four";
        }else if (number == 5){
            result = "Five";
        }else if (number == 6){
            result = "Six";
        }else if (number == 7){
            result = "Seven";
        }else if (number == 8){
            result = "Eight";
        }else if (number == 9){
            result = "Nine";
        }else {
            result = "Invalid";
        }
        System.out.println(result);


    }
}
