import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  EvenNumbers numbers = new EvenNumbers();

  while (numbers.getN1() == null) {
   System.out.print("enter first number: ");
   if (scanner.hasNextInt()) {
    int v = scanner.nextInt();
    numbers.setN1(v);
   } else {
    scanner.next();
   }
  }

  while (numbers.getN2() == null) {
   System.out.print("enter second number: ");
   if (scanner.hasNextInt()) {
    int v = scanner.nextInt();
    numbers.setN2(v);
   } else {
    scanner.next();
   }
  }

  while (numbers.getN3() == null) {
   System.out.print("enter third number: ");
   if (scanner.hasNextInt()) {
    int v = scanner.nextInt();
    numbers.setN3(v);
   } else {
    scanner.next();
   }
  }

  int total = numbers.sum();
  System.out.println("sum = " + total);
 }
}