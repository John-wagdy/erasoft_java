public class Divisors {
    private int N;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public void divisors(int n) {

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.println(i);
            }


        }
    }


}
