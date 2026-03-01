import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

  Person person = new Person();
  Player player = new Player();
  Student student = new Student();

  System.out.print("pls enter person id: ");
  person.setId(scanner.nextInt());

  System.out.print("pls enter person name: ");
  person.setName(scanner.next());

  System.out.print("pls enter player id: ");
  player.setId(scanner.nextInt());

  System.out.print("pls enter player name: ");
  player.setName(scanner.next());

  System.out.print("pls enter player number: ");
  player.setNumber(scanner.nextInt()); // no validation on number

  System.out.print("pls enter player phone: ");
  player.setPhone(scanner.next());     // setter handles phone check

  System.out.print("pls enter student id: ");
  student.setId(scanner.nextInt());

  System.out.print("pls enter student name: ");
  student.setName(scanner.next());

  System.out.print("pls enter student age: ");
  student.setAge(scanner.nextInt());   // no validation on age

  System.out.print("pls enter student phone: ");
  student.setPhone(scanner.next());    // setter handles phone check

  System.out.println("--- Person Data ---");
  System.out.println("id: " + person.getId());
  System.out.println("name: " + person.getName());

  System.out.println("--- Player Data ---");
  System.out.println("id: " + player.getId());
  System.out.println("name: " + player.getName());
  System.out.println("number: " + player.getNumber());
  System.out.println("phone: " + player.getPhone());

  System.out.println("--- Student Data ---");
  System.out.println("id: " + student.getId());
  System.out.println("name: " + student.getName());
  System.out.println("age: " + student.getAge());
  System.out.println("phone: " + student.getPhone());
 }
}