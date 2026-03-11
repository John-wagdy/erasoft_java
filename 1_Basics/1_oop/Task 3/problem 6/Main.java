import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaxMin maxMin = new MaxMin();
        maxMin.setNum1(scanner.nextInt());
        maxMin.setNum2(scanner.nextInt());
        maxMin.setNum3(scanner.nextInt());
        maxMin.calculateMaxMin(maxMin.getNum1(), maxMin.getNum2(), maxMin.getNum3());
        System.out.println(maxMin.getMin() + " " + maxMin.getMax());


    }

}










