
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Digits digits = new Digits();
        digits.setTestcases(scanner.nextInt());
        long [] digitsArray = new long[digits.getTestcases()];
        for (int i = 0; i < digits.getTestcases(); i++) {
            digitsArray[i] = scanner.nextLong();
        }
        digits.setDigits(digitsArray);
        digits.digits(digits.getDigits());
    }
}
















