import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Summission summission = new Summission();
    String num1 = scanner.next();
    String num2 = scanner.next();
    summission.setNum1(num1);
    summission.setNum2(num2);
    int res = summission.sum(summission.getNum1(),summission.getNum2());
    System.out.println(res);


    }



}
