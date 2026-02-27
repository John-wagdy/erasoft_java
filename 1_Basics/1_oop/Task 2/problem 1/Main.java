import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int number;
    String name;
    Scanner scanner = new Scanner(System.in);
    System.out.println("pls Enter your name ");
    name = scanner.next();
    System.out.println("pls Enter your  number");
    number = scanner.nextInt();
    Player player =  new Player();
    player.setName(name);
    player.setNumber(number);
    System.out.println(" player name is "+ player.getName());
    System.out.println(" player number is "+ player.getNumber());

    }
}


