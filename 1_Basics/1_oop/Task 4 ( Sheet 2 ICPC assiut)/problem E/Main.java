import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Max max = new Max();
        max.setsize(scanner.nextInt());
        int [] array = new int[max.getsize()];
        for (int i = 0; i < max.getsize(); i++) {
            array[i] = scanner.nextInt();
        }
        max.setArray(array);
        max.output();

    }
}


