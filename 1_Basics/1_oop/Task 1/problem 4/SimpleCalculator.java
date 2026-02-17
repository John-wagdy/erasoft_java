import java.util.Scanner;

public class SimpleCalculator {
    private int num1;
    private int num2;

    Scanner scanner = new Scanner(System.in);

    SimpleCalculator(){
        calculation();
    }

    private void calculation(){
        System.out.println("Enter two numbers ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println(num1 +" + "+ num2 +" = "+ (num1+num2));
        System.out.println(num1 +" * "+ num2 +" = "+ (num1*num2));
        System.out.println(num1 +" - "+ num2 +" = "+ (num1-num2));
    }

}
