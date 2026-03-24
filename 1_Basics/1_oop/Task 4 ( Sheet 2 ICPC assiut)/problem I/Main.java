import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome palindrome = new Palindrome();
        String N = scanner.next();
        palindrome.ispalindrome(N);
    }
}



