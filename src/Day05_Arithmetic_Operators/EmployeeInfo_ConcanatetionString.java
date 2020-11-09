package Day05_Arithmetic_Operators;

import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class EmployeeInfo_ConcanatetionString {
    public static void main(String[] args) {

        /*write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

         */

        String firstName = "John";
        String lastName = "Daniel";
        String gender = "Male";
        byte age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        String isFullTime = "true";
        Boolean isMarried = false;
        Double salary = 120000.50;

        String fullName = firstName + " " + lastName;

       /* System.out.println("Employee, Full Name is: " + firstName + " " +lastName);
        System.out.println("John Daniel, gender is: " + gender);
        System.out.println("John Daniel, age is: " + age + " years old");
        System.out.println("John Daniel works at: " + companyName);
        System.out.println("John Daniel, job title is: " +jobTitle);
        System.out.println("John Daniel, salary is: " + salary + " $");
        System.out.println("John Daniel married: " + isMarried);
        System.out.println("John Daniel is full time employee: " +isFullTime);

        System.out.println("Employee, Full Name is: " + firstName + " " +lastName);
        System.out.println(firstName + " "+lastName +", gender is: " + gender);
        System.out.println(firstName + " "+lastName +", age is: " + age + " years old");
        System.out.println(firstName + " "+lastName +" works at: " + companyName);
        System.out.println(firstName + " "+lastName +", job title is: " +jobTitle);
        System.out.println(firstName + " "+lastName +", salary is: " + salary + " $");
        System.out.println(firstName + " "+lastName +" married: " + isMarried);
        System.out.println(firstName + " "+lastName +" is full time employee: " +isFullTime);

        System.out.println(fullName);

        */

        System.out.println("Employee's Full Name is: " + firstName + " " +lastName);
        System.out.println(fullName +"'s gender is: " + gender);
        System.out.println(fullName +"'s age is: " + age + " years old");
        System.out.println(fullName +" works at: " + companyName);
        System.out.println(fullName +"'s job title is: " +jobTitle);
        System.out.println(fullName +"'s salary is: " + salary + " $");
        System.out.println(fullName +" married: " + isMarried);
        System.out.println(fullName +" is full time employee: " +isFullTime);










    }
}
