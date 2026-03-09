import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WelcomeWithConditions welcome = new WelcomeWithConditions();
        welcome.setNum1(scanner.nextFloat());
        welcome.setNum2(scanner.nextFloat());
        if(welcome.check(welcome.getNum1(), welcome.getNum2())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

}









