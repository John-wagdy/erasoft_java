import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvenNumbers evenNumbers = new EvenNumbers();
        evenNumbers.setN(scanner.nextInt());
        evenNumbers.printNumbers(evenNumbers.getN());
    }
}










