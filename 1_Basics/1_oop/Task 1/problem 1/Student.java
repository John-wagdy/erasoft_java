import java.util.Scanner;

public class Student {
     private int ID;
     private String name;
     private short age;


     public void input(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("pls enter your ID ");
         ID = scanner.nextInt();
         System.out.println("pls enter your name ");
         name = scanner.next();
         System.out.println("pls enter your age ");
         age = scanner.nextShort();
     }
     public void print(){
         System.out.println("your ID is "+ ID);
         System.out.println("your name is "+ name);
         System.out.println("your age is "+ age);

     }


}
