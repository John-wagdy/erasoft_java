public class MultiplicationTable {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n >= 1 && n <= 50) {
            this.n = n;
        }
    }
    public void TablaMultiplicar() {

        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " * "+ i + " = " + n * i);
        }

    }
}
