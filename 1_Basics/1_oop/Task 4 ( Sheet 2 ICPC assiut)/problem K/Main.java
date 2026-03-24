
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Divisors divisors = new Divisors();
        divisors.setN(scanner.nextInt());
        divisors.divisors(divisors.getN());
    }
}







