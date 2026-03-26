
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape1 shape1 = new Shape1();
        shape1.setHeight(scanner.nextInt());
        shape1.pyramid(shape1.getHeight());
    }
}













