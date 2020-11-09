package Day3_Suquences_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {




        double salary = 100000.00;
        double tax = 0.28;
        double totalTax = salary * tax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Total Tax: " + totalTax);
        System.out.println("\nNight Inocme: " + salaryAfterTax);

        System.out.println(" ===============================================================");


        // More example: Write a program that Convert the Kg to pound

        double kg = 75;
        double pound = 2.02;
        double kgToPound = kg * pound;

        System.out.println(kgToPound);




    }
}
