import java.util.Scanner;

public class CircleArea {
    private double R;
    private final float pi = 3.14f;
    private double area;


    public void calcArea () {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter radius ");
        R = scanner.nextDouble();
        if (R >= 1 && R <= 100) {
            area = pi * R * R;

        } else {
            System.out.println(" radius should be between 1 and 100");
        }
        System.out.printf("%.9f%n",area);
    }

}
