import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  ClupFcPlayer clupFc = new ClupFcPlayer();
  ClupRelPlayer clupRel = new ClupRelPlayer();

  System.out.print("pls enter clupFc player id: ");
  clupFc.setId(scanner.nextLong());
  System.out.print("pls enter clupFc player name: ");
  clupFc.setName(scanner.next());
  System.out.print("pls enter clupFc player number: ");
  clupFc.setNumber(scanner.nextInt());
  System.out.print("pls enter clupFc Fcode: ");
  clupFc.setFcode(scanner.next());

  System.out.print("pls enter clupRel player id: ");
  clupRel.setId(scanner.nextLong());
  System.out.print("pls enter clupRel player name: ");
  clupRel.setName(scanner.next());
  System.out.print("pls enter clupRel player number: ");
  clupRel.setNumber(scanner.nextInt());
  System.out.print("pls enter clupRel Rcode: ");
  clupRel.setRcode(scanner.next());

 

  System.out.println("--- clupFc: id, name, number, code ---");
  System.out.println(clupFc.getId() + ", " + clupFc.getName() + ", " + clupFc.getNumber() + ", " + clupFc.getFcode());


  System.out.println("--- clupRel: id, name, number, code ---");
  System.out.println(clupRel.getId() + ", " + clupRel.getName() + ", " + clupRel.getNumber() + ", " + clupRel.getRcode());
 }
}