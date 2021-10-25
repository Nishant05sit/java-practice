import java.util.Scanner;
import java.lang.String;

public class StringPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                System.out.print("Palindrome");
                break;
            } else {
                System.out.print("Not palindrome");
                break;
            }
        }
    }
}
