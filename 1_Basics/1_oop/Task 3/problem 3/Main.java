import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int divider = scanner.nextInt();
        Floor floor = new Floor(number, divider);
        Ceil ceil = new Ceil(number, divider);
        Round round = new Round(number, divider);

    }
}









