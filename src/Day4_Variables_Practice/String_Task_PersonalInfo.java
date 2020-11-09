package Day4_Variables_Practice;

public class String_Task_PersonalInfo {

    public static void main(String[] args) {

        /* task;
        declare the following
             Employee Name
             Employee ID
             Job Tittle
             Salary
             Gender
             Is Full time
         */

        String employeeName = "Mohammad Ali";
        String countryName  = "Afghanistan";
        String    SSN          = "899-878-7678";
        String employeeID   = "B232Ali";
        String jobTittle    = "Tester II";
        double salary       = 80000;
        String gender       = "M";
        boolean isFulltime  = true;

        System.out.println(employeeName);
        System.out.println( countryName);
        System.out.println( SSN);
        System.out.println(employeeID);
        System.out.println(jobTittle);
        System.out.println( "$ " + salary );
        System.out.println(gender);
        System.out.println(isFulltime);
        System.out.println("====================");
        System.out.print("Employee Name:\t" + employeeName + ","+ " Country Name: " + countryName +"," + " Social Security: " +SSN + "," + "\tEmployee ID: " + employeeID + "," +
                " Job Tittle: " + jobTittle + "," +" Salary " +"$ "+ salary + "," +" Gender " + gender + "," + " Job Type: " + isFulltime + ".");






    }

}
