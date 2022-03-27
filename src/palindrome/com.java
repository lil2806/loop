package palindrome;
import java.util.Locale;
import java.util.Scanner;
public class com {

    public static void main(String args[]){


        System.out.print("Enter any string : ");
        Scanner in = new Scanner(System.in);

        //Original string
        String origString = in.nextLine();
        int length = origString.length();
        origString=origString.toLowerCase();

        boolean isPalindrome = true;

        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex)) {
                System.out.println("String is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("String is a palindrome.");
        }
    }



}
