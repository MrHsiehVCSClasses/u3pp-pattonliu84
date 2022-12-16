package u3pp;

public class PalindromeTester {

//Palindrom test, reverses the string and sees if true. Lowers all uppercase. 
public static boolean isPalindrome(String s) {
    s = s.toLowerCase();
    String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        s = s.toLowerCase();
        reverse = reverse.toLowerCase();

        if (s.equals(reverse)) {
            return true;
        }
    return false;
    }
}
