import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multiples multiples = new Multiples();
        multiples.setNum1(scanner.nextInt());
        multiples.setNum2(scanner.nextInt());
        System.out.println(multiples.multiples(multiples.getNum1(), multiples.getNum2()));;

    }

}










