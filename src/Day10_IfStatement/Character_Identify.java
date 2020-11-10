package Day10_IfStatement;

public class Character_Identify {
    public static void main(String[] args) {

         char character = '#';
        //char character = 'A';

        boolean  isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);

         String alphabet = "";

         if ( isAlphabetic){
           //  System.out.println( character + " is alphabetic character");
             alphabet = character + " is alphabetic character";
         }else {
           //  System.out.println( character + " is not alphabetic character");
            alphabet = character + " is not alphabetic character";
         }
        System.out.println(alphabet);
        System.out.println("-------------------------------------------------");

        boolean isDigit = character >= 48 && character <= 57;

        String digit = "";
        if (isDigit) {
            digit = character + " is a digit";
        }else {
            digit = character + " is not a digit";
        }
        System.out.println(digit);
        System.out.println("--------------------------------------------------");

        // boolean specialChar = !isAlphabetic && !isDigit;
        boolean specialCharacter = isAlphabetic == false && isDigit == false;

        String specialChar = "";

        if (specialCharacter){
            specialChar = character + " is a special character";
        }else {
            specialChar = character + " is not a special character";
        }

        System.out.println(specialChar );

    }
}
