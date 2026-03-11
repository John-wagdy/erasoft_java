import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        Calculator calc = new Calculator();
        calc.setFromInput(input);

        System.out.println(calc.calculate());
    }
}



