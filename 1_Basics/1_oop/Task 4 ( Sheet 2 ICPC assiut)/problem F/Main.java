import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultiplicationTable mt = new MultiplicationTable();
        mt.setN(scanner.nextInt());
        mt.TablaMultiplicar();

    }
}


