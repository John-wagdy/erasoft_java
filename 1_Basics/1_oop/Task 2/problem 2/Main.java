import java.util.Scanner;

public class Main {
 public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  Teacher teacher = new Teacher();

  System.out.print("Enter ID: ");
  teacher.setId(scanner.nextLong());

  System.out.print("Enter Name: ");
  teacher.setName(scanner.next());

  System.out.print("Enter Age: ");
  teacher.setAge(scanner.nextFloat());

  System.out.print("Enter Phone Number: ");
  teacher.setPhoneNumber(scanner.next());

  System.out.print("Enter Salary: ");
  teacher.setSalary(scanner.nextFloat());

  System.out.println("ID: " + teacher.getId());
  System.out.println("Name: " + teacher.getName());
  System.out.println("Age: " + teacher.getAge());
  System.out.println("Phone: " + teacher.getPhoneNumber());
  System.out.println("Salary: " + teacher.getSalary());
 }
}