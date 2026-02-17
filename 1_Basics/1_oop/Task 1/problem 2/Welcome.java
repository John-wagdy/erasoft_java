import java.util.Scanner;

public class Welcome {
    private String name;

    public void hello(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome sir pls enter your name ");
        name = scanner.next();
        System.out.println("Hello, "+ name);

    }
}
