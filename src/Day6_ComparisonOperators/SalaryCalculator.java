package Day6_ComparisonOperators;

public class SalaryCalculator {

    public static void main(String[] args) {
  /*Create a class called SalaryCalculator, write a program that can calculate the tax, and salary after tax based on the hourly rate & tax rates
                ex:
                    if: rate = 48.5;
                        stateTaxRate = 0.04;
                        federalTaxRate =0.22;
                        weeklyHours = 40;

                    then output will be:
                            your salary is: 105600 USD
                            your total tax is: 27456 USD
                            your income after tax is: 78144 USD

                Assume that a year has 48 weeks (excluding PTO)

                Salary:    rate * weeklyHours * 48
                totalTax: salary *  (stateTaxRate +  federalTaxRate)
                salaryAfterTax: salary - totalTax
   */
        double rate = 50;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        int weeklyHour = 40;

        double salary = rate * weeklyHour * 48;
        double totalTaxRate = salary * (stateTaxRate + federalTaxRate);
        double salaryAfterTax = salary - totalTaxRate;

        System.out.println("Your salary is: " + "USD " + salary);
        System.out.println("Your total tax is: " + "USD " + totalTaxRate);
        System.out.println("Your income after tax is: " + "USD " + salaryAfterTax);

    }
}
