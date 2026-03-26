
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumbersHistogram numbersHistogram = new NumbersHistogram();
        numbersHistogram.setSymbol(scanner.next().charAt(0));
        numbersHistogram.setNumber(scanner.nextInt());
        numbersHistogram.setHistogram(new int[numbersHistogram.getNumber()]);
        boolean isCorrect = true;
        for (int i = 0; i < numbersHistogram.getHistogram().length; i++) {
            numbersHistogram.getHistogram()[i] = scanner.nextInt();
            if (numbersHistogram.getHistogram()[i] < 1  || numbersHistogram.getHistogram()[i] > 100) {
                isCorrect = false;
            }

        }
        if (isCorrect) {
            numbersHistogram.symbolHistogram(numbersHistogram.getSymbol(), numbersHistogram.getHistogram());
        }
    }
}












