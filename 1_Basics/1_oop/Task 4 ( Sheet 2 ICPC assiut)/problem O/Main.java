
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pyramid pyramid = new Pyramid();
        pyramid.setHeight(scanner.nextInt());
        pyramid.pyramid(pyramid.getHeight());
    }
}












