import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvenOddPositiveNegative evenOddPositiveNegative = new EvenOddPositiveNegative();
        evenOddPositiveNegative.setSize(scanner.nextInt());
        int [] array = new int[evenOddPositiveNegative.getSize()];
        for (int i = 0; i < evenOddPositiveNegative.getSize(); i++) {
            array[i] = scanner.nextInt();
        }
        evenOddPositiveNegative.setArray(array);
        evenOddPositiveNegative.output();
    }
}










