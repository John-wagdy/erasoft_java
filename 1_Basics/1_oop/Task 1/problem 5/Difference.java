import java.util.Scanner;

public class Difference {
    int num1;
    int num2;
    int num3;
    int num4;
    int difference;
    Scanner scanner = new Scanner(System.in);

    Difference(){
        calcDiff();
    }


    private void calcDiff(){

        System.out.println("Enter 4 numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();

        difference = (num1*num2)-(num3*num4);


        System.out.println("Difference = "+ difference);

    }
}
