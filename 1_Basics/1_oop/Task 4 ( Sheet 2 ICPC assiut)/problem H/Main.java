import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prime prime = new Prime();
        prime.setNumber(scanner.nextInt());
        if(prime.isprime(prime.getNumber())){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}


