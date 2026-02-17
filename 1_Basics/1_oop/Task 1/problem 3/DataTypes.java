import java.util.Scanner;

public class DataTypes {
    private int integer;
    private char c;
    private long longInt;
    private String string;
    private float fl;
    private double dou;


    public DataTypes(){
        cin_out();
    }

    private void cin_out(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter  integer char long string float double and between them put one space");
        integer = scanner.nextInt();
        c = scanner.next().charAt(0);
        longInt = scanner.nextLong();
        string = scanner.next();
        fl = scanner.nextFloat();
        dou = scanner.nextDouble();



        System.out.println(integer);
        System.out.println(c);
        System.out.println(longInt);
        System.out.println(string);
        System.out.println(fl);
        System.out.println(dou);
    }
}
