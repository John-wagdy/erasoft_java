import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  Player player = new Player();
  Student student = new Student();

  System.out.print("enter player id: ");
   player.setId(scanner.nextInt());


  System.out.print("enter player name: ");
  String pName = scanner.next();
  player.setName(pName);

  System.out.print("enter player number: ");
   player.setNumber(scanner.nextInt());


  System.out.print("enter student id: ");
   student.setId(scanner.nextInt());


  System.out.print("enter student name: ");
  student.setName(scanner.next());

  System.out.print("enter student age: ");
   student.setAge(scanner.nextInt());


  System.out.println("--- Player Data ---");
  System.out.println("id: " + player.getId());
  System.out.println("name: " + player.getName());
  System.out.println("number: " + player.getNumber());

  System.out.println("--- Student Data ---");
  System.out.println("id: " + student.getId());
  System.out.println("name: " + student.getName());
  System.out.println("age: " + student.getAge());
 }
}