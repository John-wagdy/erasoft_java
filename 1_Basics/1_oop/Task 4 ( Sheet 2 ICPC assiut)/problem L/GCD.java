
public class GCD {
    public void computeGcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);;
    }
}