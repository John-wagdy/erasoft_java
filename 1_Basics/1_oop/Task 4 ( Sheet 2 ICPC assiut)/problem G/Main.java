import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factorial factorial = new Factorial();
        factorial.setTestCase(scanner.nextInt());
        int [] array = new int[factorial.getTestCase()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && array[i] <= 20) {
                check = true;
            }
            else{
                check = false;
            }
        }
        if (check){
            factorial.factorial(array);
        }



    }
}

