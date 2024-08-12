package Mtwo;

public class MainUtility {
	public static void main(String[] args) {
       
        String regularString = "Module1 Project2";
        String emptyString = "";
        String specialCharString = "Module1 @Project2!";
        String nullString = null;

        System.out.println("Original: " + regularString + "  Reversed: " + Utility.reverse(regularString));
        System.out.println("Original: \"" + emptyString + "\"  Reversed: \"" + Utility.reverse(emptyString) + "\"");
        System.out.println("Original: " + specialCharString + "  Reversed: " + Utility.reverse(specialCharString));
        System.out.println("Original: null  Reversed: " + Utility.reverse(nullString));
    }

}
