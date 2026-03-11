import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheBrothers brothers = new TheBrothers();
        brothers.setFirestName1(scanner.next());
        brothers.setLastName1(scanner.next());
        brothers.setFirstName2(scanner.next());
        brothers.setLastname2(scanner.next());
        brothers.AreBrothers(brothers.getLastName1(),brothers.getLastname2());


    }

}


