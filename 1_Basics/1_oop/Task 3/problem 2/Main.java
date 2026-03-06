import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nsummission nsummission = new Nsummission();
        nsummission.setNumber(scanner.nextInt());
        System.out.println(nsummission.sum(nsummission.getNumber()));

    }
}




