package Day11_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        /*
        if(salary >= 30k ){

            if(Job History >= 2){
                eligible
            }else{
                not eligible due to job history
            }

        }else{
            not eligible due to salary
        }

         */


        double score = 100;
        String grade = "";

        if( 0 <= score && score <= 100 ){   // The valid scores are these...

            if( 90 <= score  ){
                grade = "A";
            } else if( 80 <= score  ){
                grade = "B";
            } else if( 70 <= score ){
                grade = "C";
            }else  if (60 <= score){
                grade = "D";
            }else if (50 <= score){
                grade = "E";
            }

        }else{
            grade = "Invalid";
        }
        System.out.println(grade);

    }
}
