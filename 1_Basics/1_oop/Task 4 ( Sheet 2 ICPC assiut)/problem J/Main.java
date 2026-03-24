import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.setN(scanner.nextInt());
        primeNumbers.primesBetween(primeNumbers.getN());
    }
}





