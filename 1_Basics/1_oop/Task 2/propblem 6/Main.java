import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  PrivateSchool privateSchool = new PrivateSchool();
  PublicSchool publicSchool = new PublicSchool();

  System.out.print("pls enter private school id: ");
  privateSchool.setId(scanner.nextLong());
  System.out.print("pls enter private school name: ");
  privateSchool.setName(scanner.next());

  System.out.print("pls enter public school id: ");
  publicSchool.setId(scanner.nextLong());
  System.out.print("pls enter public school name: ");
  publicSchool.setName(scanner.next());

  System.out.println("--- Private School ---");
  System.out.println("id: " + privateSchool.getId());
  System.out.println("name: " + privateSchool.getName());

  System.out.println("--- Public School ---");
  System.out.println("id: " + publicSchool.getId());
  System.out.println("name: " + publicSchool.getName());
 }
}