import java.util.Scanner;
public class StringOperations
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String numStr = sc.next();
        int num = Integer.parseInt(numStr); 
        System.out.println("Converted to integer: " + num);
        String strNum = Integer.toString(num); 
        System.out.println("Converted back to string: " + strNum);
        sc.nextLine();

        // ii. Convert string from lower to upper and vice versa
        System.out.print("\nEnter a string: ");
        String input = sc.nextLine();
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());

        // iii. Extract number of characters from a string
        System.out.println("\nNumber of characters: " + input.length());

        // iv. Compare two strings
        System.out.print("\nEnter another string to compare: ");
        String anotherString = sc.nextLine();
        if (input.equals(anotherString)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        // v. Search and replace a substring
        System.out.print("\nEnter substring to search: ");
        String search = sc.nextLine();
        System.out.print("Enter replacement string: ");
        String replace = sc.nextLine();
        String modifiedString = input.replace(search, replace);
        System.out.println("Modified string: " + modifiedString);

        // vi. Count vowels, digits, special characters, lower and upper alphabets, words
        int vowels = 0, digits = 0, specialChars = 0, lower = 0, upper = 0, words = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits++;
            } else if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isUpperCase(ch)) {
                upper++;
            } else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
        }
        words = input.trim().isEmpty() ? 0 : input.trim().split("\\s+").length;

        System.out.println("\nVowels: " + vowels);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specialChars);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Words: " + words);

    }
}
 