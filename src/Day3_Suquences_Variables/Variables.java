package Day3_Suquences_Variables;

public class Variables {
    public static void main(String[] args) {
        /*
        Variable naming roles:
        Declare Variable:
              DataType variableName = Data;

               ==>> and the variable name should be unique!
               ==>> and the variable name can't be start with numbers!
               ==>> and in variable name only the $ sign and _ can accept!
               ==>> and the java keywords can't be use in variable name!
               ==>> every variable name most be readable and meaningful!
               ==>> if the variable name contain of several words,
                    it most apply in camelCase style or format

                    --> in Java this two are not the same "taxrate =! TaxRate =! taxRate"

         */

        // length: 2, width 4 area: 8

        byte length = 2;
        byte width = 4;
        System.out.println(length * width);

        // 140
        // byte num1 = 140;
        short num2 = 140;

        // 40000
        //short salary = 40000;
        int salary = 40000;

       // int _largnumber_ = 999999999;

        long largnumber$ = 999999999;
        long largnumber1 = 99999999999l;

        // PI = 3.14
        double $PI = 3.14;






    }
}
